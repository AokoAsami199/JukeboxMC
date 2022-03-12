package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityStrider;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemStriderSpawnEgg extends Item {

    public ItemStriderSpawnEgg() {
        super( "minecraft:strider_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityStrider entityStrider = new EntityStrider();
        entityStrider.setLocation( location.add( 0, entityStrider.getEyeHeight(), 0 ) );
        entityStrider.spawn();

        return true;
    }
}