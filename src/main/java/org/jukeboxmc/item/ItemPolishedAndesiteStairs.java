package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockPolishedAndesiteStairs;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPolishedAndesiteStairs extends Item {

    public ItemPolishedAndesiteStairs() {
        super( -174 );
    }

    @Override
    public BlockPolishedAndesiteStairs getBlock() {
        return new BlockPolishedAndesiteStairs();
    }
}
