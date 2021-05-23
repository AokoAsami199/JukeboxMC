package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockCobblestone;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCobblestone extends Item {

    public ItemCobblestone() {
        super( 4 );
    }

    @Override
    public BlockCobblestone getBlock() {
        return new BlockCobblestone();
    }
}
