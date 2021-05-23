package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockLog2;
import org.jukeboxmc.block.BlockType;
import org.jukeboxmc.block.type.LogType2;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemLog2 extends Item {

    public ItemLog2( int blockRuntimeId ) {
        super( 162, blockRuntimeId );
    }

    @Override
    public BlockLog2 getBlock() {
        return (BlockLog2) BlockType.getBlock( this.blockRuntimeId );
    }

    public LogType2 getLogType() {
        return this.getBlock().getLogType();
    }

}
