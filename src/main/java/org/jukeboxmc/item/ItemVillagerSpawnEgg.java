package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityVillagerV2;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemVillagerSpawnEgg extends Item {

    public ItemVillagerSpawnEgg() {
        super( "minecraft:villager_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityVillagerV2 entityVillagerV2 = new EntityVillagerV2();
        entityVillagerV2.setLocation( location.add( 0, entityVillagerV2.getEyeHeight(), 0 ) );
        entityVillagerV2.spawn();

        return true;
    }
}