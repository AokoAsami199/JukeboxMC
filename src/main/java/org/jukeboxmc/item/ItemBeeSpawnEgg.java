package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityBee;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBeeSpawnEgg extends Item {

    public ItemBeeSpawnEgg() {
        super( "minecraft:bee_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation().add( 0, 1, 0 );

        EntityBee entityBee = new EntityBee();
        entityBee.setLocation( location );
        entityBee.spawn();

        return true;
    }
}