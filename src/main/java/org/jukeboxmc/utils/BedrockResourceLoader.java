package org.jukeboxmc.utils;

import com.google.common.io.ByteStreams;
import com.google.gson.*;
import lombok.SneakyThrows;
import org.jukeboxmc.JukeboxMC;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BedrockResourceLoader {

    private static final Map<Integer, List<Map<String, Object>>> itemPalettes = new HashMap<>();
    private static final Map<Integer, List<Map<String, Object>>> creativeItems = new HashMap<>();
    private static final Map<Integer, Map<String, Integer>> itemIdByName = new HashMap<>();

    private static final Map<Integer, byte[]> biomeDefinitions = new HashMap<>();
    private static final Map<Integer, byte[]> entityIdentifiers = new HashMap<>();

    @SneakyThrows
    public static void init() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        File resourcesDirectory = new File( "src/main/resources/" );
        File itemPaletteDirectory = new File( resourcesDirectory.getPath() + "/item_palette" );
        File creativeItemsDirectory = new File( resourcesDirectory.getPath() + "/creative_items" );
        File biomeDefinitionsDirectory = new File( resourcesDirectory.getPath() + "/biome_definitions" );
        File entityIdentifiersDirectory = new File( resourcesDirectory.getPath() + "/entity_identifiers" );

        for ( File file : Objects.requireNonNull( itemPaletteDirectory.listFiles() ) ) {
            if ( file != null ) {
                JsonElement parseItem = new JsonParser().parse( new FileReader( file ) );

                String minecraftVersion = file.getName().split( "_v" )[1].split( "\\." )[0];

                MultiProtocolUtil.getProtocolByMinecraftVersion( minecraftVersion ).ifPresent( protocol ->
                        BedrockResourceLoader.itemPalettes.put( protocol, gson.fromJson( parseItem, List.class ) )
                );
            }
        }

        for ( File file : Objects.requireNonNull( creativeItemsDirectory.listFiles() ) ) {
            if ( file != null ) {
                JsonArray parseCreative = new JsonParser().parse( new FileReader( file ) ).getAsJsonObject().getAsJsonArray( "items" );

                String minecraftVersion = file.getName().split( "_v" )[1].split( "\\." )[0];

                MultiProtocolUtil.getProtocolByMinecraftVersion( minecraftVersion ).ifPresent( protocol ->
                        BedrockResourceLoader.creativeItems.put( protocol, gson.fromJson( parseCreative, List.class ) )
                );
            }
        }

        for ( Map.Entry<Integer, List<Map<String, Object>>> entry : itemPalettes.entrySet() ) {
            Map<String, Integer> itemIdMap = new HashMap<>();

            for ( Map<String, Object> objectMap : entry.getValue() ) {
                itemIdMap.put( (String) objectMap.get( "name" ), (int) (double) objectMap.get( "id" ) );
            }

            BedrockResourceLoader.itemIdByName.put( entry.getKey(), itemIdMap );
        }

        for ( File file : Objects.requireNonNull( biomeDefinitionsDirectory.listFiles() ) ) {
            if ( file != null ) {
                String minecraftVersion = file.getName().split( "_v" )[1].split( "\\." )[0];

                MultiProtocolUtil.getProtocolByMinecraftVersion( minecraftVersion ).ifPresent( protocol -> {
                    try {
                        BedrockResourceLoader.biomeDefinitions.put( protocol, ByteStreams.toByteArray( new FileInputStream( file ) ) );
                    } catch ( IOException e ) {
                        e.printStackTrace();
                    }
                } );
            }
        }

        for ( File file : Objects.requireNonNull( entityIdentifiersDirectory.listFiles() ) ) {
            if ( file != null ) {
                String minecraftVersion = file.getName().split( "_v" )[1].split( "\\." )[0];

                MultiProtocolUtil.getProtocolByMinecraftVersion( minecraftVersion ).ifPresent( protocol -> {
                    try {
                        BedrockResourceLoader.entityIdentifiers.put( protocol, ByteStreams.toByteArray( new FileInputStream( file ) ) );
                    } catch ( IOException e ) {
                        e.printStackTrace();
                    }
                } );
            }
        }
    }

    public static List<Map<String, Object>> getItemPalettesByProtocol( int protocol ) {
        return itemPalettes.get( protocol );
    }

    public static List<Map<String, Object>> getCreativeItemsByProtocol( int protocol ) {
        return creativeItems.get( protocol );
    }

    public static Map<String, Integer> getItemIdByNameByProtocol( int protocol ) {
        return itemIdByName.get( protocol );
    }

    public static byte[] getBiomeDefinitionsByProtocol( int protocol ) {
        return biomeDefinitions.get( protocol );
    }

    public static byte[] getEntityIdentifiersByProtocol( int protocol ) {
        return entityIdentifiers.get( protocol );
    }
}