package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntitySquid;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSquidSpawnEgg extends Item {

    public ItemSquidSpawnEgg() {
        super( "minecraft:squid_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntitySquid entitySquid = new EntitySquid();
        entitySquid.setLocation( location.add( 0, entitySquid.getEyeHeight(), 0 ) );
        entitySquid.spawn();

        return true;
    }
}