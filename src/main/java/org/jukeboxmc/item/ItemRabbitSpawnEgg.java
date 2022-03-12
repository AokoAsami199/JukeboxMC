package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityRabbit;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemRabbitSpawnEgg extends Item {

    public ItemRabbitSpawnEgg() {
        super ( "minecraft:rabbit_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityRabbit entityRabbit = new EntityRabbit();
        entityRabbit.setLocation( location.add( 0, entityRabbit.getEyeHeight(), 0 ) );
        entityRabbit.spawn();

        return true;
    }
}