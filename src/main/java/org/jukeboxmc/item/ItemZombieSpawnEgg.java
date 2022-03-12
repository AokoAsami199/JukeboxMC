package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.mob.EntityZombie;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemZombieSpawnEgg extends Item {

    public ItemZombieSpawnEgg() {
        super( "minecraft:zombie_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityZombie entityZombie = new EntityZombie();
        entityZombie.setLocation( location.add( 0, entityZombie.getEyeHeight(), 0 ) );
        entityZombie.spawn();

        return true;
    }
}