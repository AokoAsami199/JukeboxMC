package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockJungleDoor;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemJungleDoor extends Item {

    public ItemJungleDoor() {
        super( 545 );
    }

    @Override
    public BlockJungleDoor getBlock() {
        return new BlockJungleDoor();
    }
}
