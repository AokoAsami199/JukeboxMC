package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockGlassPane;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemGlassPane extends Item {

    public ItemGlassPane() {
        super( 102 );
    }

    @Override
    public BlockGlassPane getBlock() {
        return new BlockGlassPane();
    }
}
