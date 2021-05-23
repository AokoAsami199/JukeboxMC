package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockCrimsonRoots;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCrimsonRoots extends Item {

    public ItemCrimsonRoots() {
        super( -223 );
    }

    @Override
    public BlockCrimsonRoots getBlock() {
        return new BlockCrimsonRoots();
    }
}
