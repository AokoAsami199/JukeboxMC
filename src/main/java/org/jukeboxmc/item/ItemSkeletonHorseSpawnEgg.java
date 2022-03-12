package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntitySkeletonHorse;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSkeletonHorseSpawnEgg extends Item {

    public ItemSkeletonHorseSpawnEgg() {
        super( "minecraft:skeleton_horse_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntitySkeletonHorse entitySkeletonHorse = new EntitySkeletonHorse();
        entitySkeletonHorse.setLocation( location.add( 0, entitySkeletonHorse.getEyeHeight(), 0 ) );
        entitySkeletonHorse.spawn();

        return true;
    }
}