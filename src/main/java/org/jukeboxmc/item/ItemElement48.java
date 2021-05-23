package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.BlockElement48;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemElement48 extends Item {

    public ItemElement48() {
        super( -59 );
    }

    @Override
    public Block getBlock() {
        return new BlockElement48();
    }
}
