package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityTropicalFish;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemTropicalFishSpawnEgg extends Item {

    public ItemTropicalFishSpawnEgg() {
        super( "minecraft:tropical_fish_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation().add( 0, 1, 0 );

        EntityTropicalFish entityTropicalFish = new EntityTropicalFish();
        entityTropicalFish.setLocation( location );
        entityTropicalFish.spawn();

        return true;
    }
}