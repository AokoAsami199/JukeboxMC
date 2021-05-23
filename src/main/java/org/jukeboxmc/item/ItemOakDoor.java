package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockOakDoor;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemOakDoor extends Item {

    public ItemOakDoor() {
        super( 359 );
    }

    @Override
    public BlockOakDoor getBlock() {
        return new BlockOakDoor();
    }
}
