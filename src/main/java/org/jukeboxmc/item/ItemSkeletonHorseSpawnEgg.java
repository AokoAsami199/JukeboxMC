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
        Location location = clickedBlock.getLocation().add( 0, 1, 0 );

        EntitySkeletonHorse entitySkeletonHorse = new EntitySkeletonHorse();
        entitySkeletonHorse.setLocation( location );
        entitySkeletonHorse.spawn();

        return true;
    }
}