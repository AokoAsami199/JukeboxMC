package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityOcelot;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemOcelotSpawnEgg extends Item {

    public ItemOcelotSpawnEgg() {
        super( "minecraft:ocelot_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityOcelot entityOcelot = new EntityOcelot();
        entityOcelot.setLocation( location.add( 0, entityOcelot.getEyeHeight(), 0 ) );
        entityOcelot.spawn();

        return true;
    }
}