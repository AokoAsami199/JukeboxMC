package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityCat;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCatSpawnEgg extends Item {

    public ItemCatSpawnEgg() {
        super( "minecraft:cat_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityCat entityCat = new EntityCat();
        entityCat.setLocation( location.add( 0, entityCat.getEyeHeight(), 0 ) );
        entityCat.spawn();

        return true;
    }
}