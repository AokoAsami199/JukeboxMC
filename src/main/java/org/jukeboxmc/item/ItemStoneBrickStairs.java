package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockStoneBrickStairs;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemStoneBrickStairs extends Item {

    public ItemStoneBrickStairs() {
        super( 109 );
    }

    @Override
    public BlockStoneBrickStairs getBlock() {
        return new BlockStoneBrickStairs();
    }
}
