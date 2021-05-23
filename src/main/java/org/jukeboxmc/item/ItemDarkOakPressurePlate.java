package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockDarkOakPressurePlate;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemDarkOakPressurePlate extends Item {

    public ItemDarkOakPressurePlate() {
        super( -152 );
    }

    @Override
    public BlockDarkOakPressurePlate getBlock() {
        return new BlockDarkOakPressurePlate();
    }
}
