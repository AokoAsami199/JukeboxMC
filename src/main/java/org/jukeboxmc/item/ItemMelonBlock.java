package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockMelonBlock;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemMelonBlock extends Item {

    public ItemMelonBlock() {
        super( 103 );
    }

    @Override
    public BlockMelonBlock getBlock() {
        return new BlockMelonBlock();
    }
}
