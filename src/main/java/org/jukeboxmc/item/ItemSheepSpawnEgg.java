package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntitySheep;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSheepSpawnEgg extends Item {

    public ItemSheepSpawnEgg() {
        super( "minecraft:sheep_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntitySheep entitySheep = new EntitySheep();
        entitySheep.setLocation( location.add( 0, entitySheep.getEyeHeight(), 0 ) );
        entitySheep.spawn();

        return true;
    }
}