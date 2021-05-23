package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockCrackedPolishedBlackstoneBricks;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCrackedPolishedBlackstoneBricks extends Item {

    public ItemCrackedPolishedBlackstoneBricks() {
        super( -280 );
    }

    @Override
    public BlockCrackedPolishedBlackstoneBricks getBlock() {
        return new BlockCrackedPolishedBlackstoneBricks();
    }
}
