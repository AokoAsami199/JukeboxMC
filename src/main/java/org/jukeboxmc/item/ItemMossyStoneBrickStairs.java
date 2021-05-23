package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockMossyStoneBrickStairs;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemMossyStoneBrickStairs extends Item {

    public ItemMossyStoneBrickStairs() {
        super( -175 );
    }

    @Override
    public BlockMossyStoneBrickStairs getBlock() {
        return new BlockMossyStoneBrickStairs();
    }
}
