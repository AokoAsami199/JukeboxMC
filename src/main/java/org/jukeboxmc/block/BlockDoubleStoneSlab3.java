package org.jukeboxmc.block;

import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.block.type.StoneSlab3Type;
import org.jukeboxmc.item.Item;
import org.jukeboxmc.item.ItemStoneSlab3;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;
import org.jukeboxmc.world.World;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockDoubleStoneSlab3 extends BlockSlab {

    public BlockDoubleStoneSlab3() {
        super( "minecraft:double_stone_slab3" );
    }

    @Override
    public boolean placeBlock( Player player, World world, Vector blockPosition, Vector placePosition, Vector clickedPosition, Item itemIndHand, BlockFace blockFace ) {
        super.placeBlock( player, world, blockPosition, placePosition, clickedPosition, itemIndHand, blockFace );
        world.setBlock( placePosition, this );
        return true;
    }

    @Override
    public ItemStoneSlab3 toItem() {
        return new ItemStoneSlab3(this.runtimeId);
    }

    @Override
    public BlockType getBlockType() {
        return BlockType.STONE_SLAB3;
    }

    public Block setStoneSlabType( StoneSlab3Type stoneSlabType ) {
        this.setState( "stone_slab_type_3", stoneSlabType.name().toLowerCase() );
        return this;
    }

    public StoneSlab3Type getStoneSlabType() {
        return this.stateExists( "stone_slab_type_3" ) ? StoneSlab3Type.valueOf( this.getStringState( "stone_slab_type_3" ) ) : StoneSlab3Type.END_STONE_BRICK;
    }
}
