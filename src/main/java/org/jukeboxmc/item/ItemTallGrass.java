package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockTallGrass;
import org.jukeboxmc.block.BlockType;
import org.jukeboxmc.block.type.GrassType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemTallGrass extends Item {

    public ItemTallGrass( int blockRuntimeId ) {
        super( "minecraft:tallgrass", blockRuntimeId );
    }

    @Override
    public BlockTallGrass getBlock() {
        return (BlockTallGrass) BlockType.getBlock( this.blockRuntimeId );
    }

    public GrassType getGrassType() {
        return this.getBlock().getGrassType();
    }

}
