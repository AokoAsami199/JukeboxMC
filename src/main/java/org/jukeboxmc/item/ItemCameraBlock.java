package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockCamera;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCameraBlock extends Item {

    public ItemCameraBlock() {
        super(  242 );
    }

    @Override
    public BlockCamera getBlock() {
        return new BlockCamera();
    }
}
