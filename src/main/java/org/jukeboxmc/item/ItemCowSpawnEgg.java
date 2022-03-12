package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityCow;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCowSpawnEgg extends Item {

    public ItemCowSpawnEgg() {
        super( "minecraft:cow_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityCow entityCow = new EntityCow();
        entityCow.setLocation( location.add( 0, entityCow.getEyeHeight(), 0 ) );
        entityCow.spawn();

        return true;
    }
}