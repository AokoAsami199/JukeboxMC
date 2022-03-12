package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityFox;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemFoxSpawnEgg extends Item {

    public ItemFoxSpawnEgg() {
        super( "minecraft:fox_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityFox entityFox = new EntityFox();
        entityFox.setLocation( location.add( 0, entityFox.getEyeHeight(), 0 ) );
        entityFox.spawn();

        return true;
    }
}