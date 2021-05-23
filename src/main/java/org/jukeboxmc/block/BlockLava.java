package org.jukeboxmc.block;

import org.jukeboxmc.item.ItemLava;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockLava extends Block {

    public BlockLava() {
        super( "minecraft:lava" );
    }

    @Override
    public ItemLava toItem() {
        return new ItemLava();
    }

    @Override
    public BlockType getBlockType() {
        return BlockType.LAVA;
    }

    public void setLiquidDepth( int value ) {
        this.setState( "liquid_depth", value );
    }

    public int getLiquidDepth() {
        return this.stateExists( "liquid_depth" ) ? this.getIntState( "liquid_depth" ) : 0;
    }
}
