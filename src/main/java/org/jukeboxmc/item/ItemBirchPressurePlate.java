package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockBirchPressurePlate;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBirchPressurePlate extends Item {

    public ItemBirchPressurePlate() {
        super( -151 );
    }

    @Override
    public BlockBirchPressurePlate getBlock() {
        return new BlockBirchPressurePlate();
    }
}
