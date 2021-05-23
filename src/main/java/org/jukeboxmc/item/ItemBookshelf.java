package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockBookshelf;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBookshelf extends Item {

    public ItemBookshelf() {
        super( 47 );
    }

    @Override
    public BlockBookshelf getBlock() {
        return new BlockBookshelf();
    }
}
