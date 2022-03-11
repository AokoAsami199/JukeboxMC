package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityPolarBear;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPolarBearSpawnEgg extends Item {

    public ItemPolarBearSpawnEgg() {
        super( "minecraft:polar_bear_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation().add( 0, 1, 0 );

        EntityPolarBear entityPolarBear = new EntityPolarBear();
        entityPolarBear.setLocation( location );
        entityPolarBear.spawn();

        return true;
    }
}