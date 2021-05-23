package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockStrippedDarkOakLog;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemStrippedDarkOakLog extends Item {

    public ItemStrippedDarkOakLog() {
        super( -9 );
    }

    @Override
    public BlockStrippedDarkOakLog getBlock() {
        return new BlockStrippedDarkOakLog();
    }
}
