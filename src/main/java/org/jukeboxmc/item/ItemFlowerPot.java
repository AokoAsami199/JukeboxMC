package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockFlowerPot;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemFlowerPot extends Item {

    public ItemFlowerPot() {
        super( 504 );
    }

    @Override
    public BlockFlowerPot getBlock() {
        return new BlockFlowerPot();
    }
}
