package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.mob.EntityCreeper;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCreeperSpawnEgg extends Item {

    public ItemCreeperSpawnEgg() {
        super( "minecraft:creeper_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityCreeper entityCreeper = new EntityCreeper();
        entityCreeper.setLocation( location.add( 0, entityCreeper.getEyeHeight(), 0 ) );
        entityCreeper.spawn();

        return true;
    }
}