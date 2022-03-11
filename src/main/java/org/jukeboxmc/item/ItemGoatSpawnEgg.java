package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityGoat;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemGoatSpawnEgg extends Item {

    public ItemGoatSpawnEgg() {
        super( "minecraft:goat_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation().add( 0, 1, 0 );

        EntityGoat entityGoat = new EntityGoat();
        entityGoat.setLocation( location );
        entityGoat.spawn();

        return true;
    }
}