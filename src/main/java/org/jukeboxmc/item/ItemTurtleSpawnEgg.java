package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityTurtle;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemTurtleSpawnEgg extends Item {

    public ItemTurtleSpawnEgg() {
        super( "minecraft:turtle_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityTurtle entityTurtle = new EntityTurtle();
        entityTurtle.setLocation( location.add( 0, entityTurtle.getEyeHeight(), 0 ) );
        entityTurtle.spawn();

        return true;
    }
}