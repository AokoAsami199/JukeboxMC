package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockAcaciaStairs;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemAcaciaStairs extends Item {

    public ItemAcaciaStairs() {
        super( 163 );
    }

    @Override
    public BlockAcaciaStairs getBlock() {
        return new BlockAcaciaStairs();
    }
}
