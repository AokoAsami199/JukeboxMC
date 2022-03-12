package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityHorse;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemHorseSpawnEgg extends Item {

    public ItemHorseSpawnEgg() {
        super( "minecraft:horse_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityHorse entityHorse = new EntityHorse();
        entityHorse.setLocation( location.add( 0, entityHorse.getEyeHeight(), 0 ) );
        entityHorse.spawn();

        return true;
    }
}