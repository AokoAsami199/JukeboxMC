package org.jukeboxmc.block;

import org.jukeboxmc.item.ItemBarrier;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockBarrier extends Block {

    public BlockBarrier() {
        super( "minecraft:barrier" );
    }

    @Override
    public ItemBarrier toItem() {
        return new ItemBarrier();
    }

    @Override
    public BlockType getBlockType() {
        return BlockType.BARRIER;
    }

}
