package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.mob.EntitySkeleton;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSkeletonSpawnEgg extends Item {

    public ItemSkeletonSpawnEgg() {
        super( "minecraft:skeleton_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntitySkeleton entitySkeleton = new EntitySkeleton();
        entitySkeleton.setLocation( location.add( 0, entitySkeleton.getEyeHeight(), 0 ) );
        entitySkeleton.spawn();

        return true;
    }
}