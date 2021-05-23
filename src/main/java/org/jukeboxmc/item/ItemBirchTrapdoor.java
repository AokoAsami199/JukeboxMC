package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockBirchTrapdoor;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBirchTrapdoor extends Item {

    public ItemBirchTrapdoor() {
        super( -146 );
    }

    @Override
    public BlockBirchTrapdoor getBlock() {
        return new BlockBirchTrapdoor();
    }
}
