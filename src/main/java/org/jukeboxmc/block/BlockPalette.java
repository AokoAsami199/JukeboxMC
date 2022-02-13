package org.jukeboxmc.block;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jukeboxmc.nbt.NBTInputStream;
import org.jukeboxmc.nbt.NbtMap;
import org.jukeboxmc.nbt.NbtType;
import org.jukeboxmc.network.packet.Protocol;
import org.jukeboxmc.utils.MultiProtocolUtil;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.zip.GZIPInputStream;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockPalette {

    private static final Map<String, AtomicInteger> RUNTIME_COUNTER = new LinkedHashMap<>();
    public static final Map<Integer, Block> RUNTIME_TO_BLOCK = new LinkedHashMap<>();
    public static final Map<Integer, Map<Integer, NbtMap>> BLOCK_PALETTE = new LinkedHashMap<>();

    public static Map<Integer, Map<BlockData, Integer>> TEST = new HashMap<>();
    public static Map<String, Integer> DEFAULTS = new HashMap<>();

    public static final List<BlockData> BLOCK_DATA = new CopyOnWriteArrayList<>();

    public static void init() {
        File resourcesDirectory = new File( "src/main/resources/" );
        File blockPaletteDirectory = new File( resourcesDirectory.getPath() + "/block_palette" );

        for ( File file : Objects.requireNonNull( blockPaletteDirectory.listFiles() ) ) {
            if ( file != null ) {
                try ( NBTInputStream nbtReader = new NBTInputStream( new DataInputStream( new GZIPInputStream( new FileInputStream( file ) ) ) ) ) {
                    NbtMap nbtMap = (NbtMap) nbtReader.readTag();

                    Map<Integer, NbtMap> blockPalette = new HashMap<>();

                    String minecraftVersion = file.getName().split( "_v" )[1].split( "\\." )[0];

                    Map<BlockData, Integer> testMap = new HashMap<>();

                    if ( !RUNTIME_COUNTER.containsKey( minecraftVersion ) ) {
                        RUNTIME_COUNTER.put( minecraftVersion, new AtomicInteger( 0 ) );
                    }

                    for ( NbtMap blockMap : nbtMap.getList( "blocks", NbtType.COMPOUND ) ) {
                        int runtimeId = RUNTIME_COUNTER.get( minecraftVersion ).getAndIncrement();

                        blockPalette.put( runtimeId, blockMap );
                        testMap.put( new BlockData( blockMap.getString( "name" ), blockMap.getCompound( "states" ) ), runtimeId );

                        DEFAULTS.putIfAbsent( blockMap.getString( "name" ), runtimeId );
                    }

                    MultiProtocolUtil.getProtocolByMinecraftVersion( minecraftVersion ).ifPresent( protocol -> {
                        BLOCK_PALETTE.put( protocol, blockPalette );
                        TEST.put( protocol, testMap );
                    } );
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static NbtMap getBlockNBT( int runtimeId, int protocol ) {
        return BLOCK_PALETTE.get( protocol ).get( runtimeId );
    }

    public static NbtMap getBlockNBT( int runtimeId ) {
        return BlockPalette.getBlockNBT( runtimeId, Protocol.LATEST_PROTOCOL );
    }

    public static int getRuntimeId( String identifier, NbtMap states, int protocol ) {
        return TEST.get( protocol ).getOrDefault( new BlockData( identifier, states ), 134 );
    }

    public static int getRuntimeId( String identifier, NbtMap states ) {
        return BlockPalette.getRuntimeId( identifier, states, Protocol.LATEST_PROTOCOL );
    }

    public static Integer getRuntimeId( NbtMap blockMap, int protocol ) {
        for ( Integer runtimeId : BLOCK_PALETTE.get( protocol ).keySet() ) {
            if ( BLOCK_PALETTE.get( protocol ).get( runtimeId ).equals( blockMap ) ) {
                return runtimeId;
            }
        }
        throw new NullPointerException( "Block was not found" );
    }

    public static Integer getRuntimeId( NbtMap blockMap ) {
        return BlockPalette.getRuntimeId( blockMap, Protocol.LATEST_PROTOCOL );
    }

    public static List<NbtMap> searchBlocks( Predicate<NbtMap> predicate, int protocol ) {
        List<NbtMap> blocks = new ArrayList<>();
        for ( NbtMap nbtMap : BLOCK_PALETTE.get( protocol ).values() ) {
            if ( predicate.test( nbtMap ) ) {
                blocks.add( nbtMap );
            }
        }
        return Collections.unmodifiableList( blocks );
    }

    public static List<NbtMap> searchBlocks( Predicate<NbtMap> predicate ) {
        return BlockPalette.searchBlocks( predicate, Protocol.LATEST_PROTOCOL );
    }

    @Data
    @AllArgsConstructor
    public static class BlockData {

        private String identifier;
        private NbtMap states;

    }
}