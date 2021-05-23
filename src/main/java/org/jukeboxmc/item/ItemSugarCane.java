package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockSugarCane;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSugarCane extends Item {

    public ItemSugarCane() {
        super( 383 );
    }

    @Override
    public BlockSugarCane getBlock() {
        return new BlockSugarCane();
    }
}
