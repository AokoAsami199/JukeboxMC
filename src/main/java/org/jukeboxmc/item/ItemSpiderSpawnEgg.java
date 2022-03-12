package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.mob.EntitySpider;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSpiderSpawnEgg extends Item {

    public ItemSpiderSpawnEgg() {
        super( "minecraft:spider_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntitySpider entitySpider = new EntitySpider();
        entitySpider.setLocation( location.add( 0, entitySpider.getEyeHeight(), 0 ) );
        entitySpider.spawn();

        return true;
    }
}