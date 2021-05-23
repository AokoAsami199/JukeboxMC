package org.jukeboxmc.block;

import org.jukeboxmc.item.ItemKelp;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockKelp extends Block {

    public BlockKelp() {
        super( "minecraft:kelp" );
    }

    @Override
    public ItemKelp toItem() {
        return new ItemKelp();
    }

    @Override
    public BlockType getBlockType() {
        return BlockType.KELP;
    }

    public void setKelpAge( int value ) { //0-25
        this.setState( "kelp_age", value );
    }

    public int getKelpAge() {
        return this.stateExists( "kelp_age" ) ? this.getIntState( "kelp_age" ) : 0;
    }
}
