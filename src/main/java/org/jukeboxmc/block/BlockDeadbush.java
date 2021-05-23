package org.jukeboxmc.block;

import org.jukeboxmc.item.ItemDeadbush;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockDeadbush extends Block {

    public BlockDeadbush() {
        super( "minecraft:deadbush" );
    }

    @Override
    public ItemDeadbush toItem() {
        return new ItemDeadbush();
    }

    @Override
    public BlockType getBlockType() {
        return BlockType.DEADBUSH;
    }

}
