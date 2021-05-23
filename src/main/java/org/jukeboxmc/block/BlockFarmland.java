package org.jukeboxmc.block;

import org.jukeboxmc.item.ItemFarmland;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockFarmland extends Block {

    public BlockFarmland() {
        super( "minecraft:farmland" );
    }

    @Override
    public ItemFarmland toItem() {
        return new ItemFarmland();
    }

    @Override
    public BlockType getBlockType() {
        return BlockType.FARMLAND;
    }

    public void setMoisturizedAmount( int value ) {
        this.setState( "moisturized_amount", value );
    }

    public int getMoisturizedAmount() {
        return this.stateExists( "moisturized_amount" ) ? this.getIntState( "moisturized_amount" ) : 0;
    }
}
