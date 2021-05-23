package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockSnowLayer;
import org.jukeboxmc.block.BlockType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSnowLayer extends Item {

    public ItemSnowLayer( int blockRuntimeId ) {
        super( 78, blockRuntimeId );
    }

    @Override
    public BlockSnowLayer getBlock() {
        return (BlockSnowLayer) BlockType.getBlock(this.blockRuntimeId);
    }
}
