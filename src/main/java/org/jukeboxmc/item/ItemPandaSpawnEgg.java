package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityPanda;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPandaSpawnEgg extends Item {

    public ItemPandaSpawnEgg() {
        super( "minecraft:panda_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityPanda entityPanda = new EntityPanda();
        entityPanda.setLocation( location.add( 0, entityPanda.getEyeHeight(), 0 ) );
        entityPanda.spawn();

        return true;
    }
}