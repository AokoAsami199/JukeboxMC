package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityMooshroom;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemMooshroomSpawnEgg extends Item {

    public ItemMooshroomSpawnEgg() {
        super( "minecraft:mooshroom_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityMooshroom entityMooshroom = new EntityMooshroom();
        entityMooshroom.setLocation( location.add( 0, entityMooshroom.getEyeHeight(), 0 ) );
        entityMooshroom.spawn();

        return true;
    }
}