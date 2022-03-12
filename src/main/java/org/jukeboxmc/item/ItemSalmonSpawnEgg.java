package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntitySalmon;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSalmonSpawnEgg extends Item {

    public ItemSalmonSpawnEgg() {
        super( "minecraft:salmon_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntitySalmon entitySalmon = new EntitySalmon();
        entitySalmon.setLocation( location.add( 0, entitySalmon.getEyeHeight(), 0 ) );
        entitySalmon.spawn();

        return true;
    }
}