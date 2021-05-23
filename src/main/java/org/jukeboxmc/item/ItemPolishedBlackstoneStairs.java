package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockPolishedBlackstoneStairs;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPolishedBlackstoneStairs extends Item {

    public ItemPolishedBlackstoneStairs() {
        super( -292 );
    }

    @Override
    public BlockPolishedBlackstoneStairs getBlock() {
        return new BlockPolishedBlackstoneStairs();
    }
}
