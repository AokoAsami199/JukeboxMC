package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityLlama;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemLlamaSpawnEgg extends Item {

    public ItemLlamaSpawnEgg() {
        super( "llama_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityLlama entityLlama = new EntityLlama();
        entityLlama.setLocation( location.add( 0, entityLlama.getEyeHeight(), 0 ) );
        entityLlama.spawn();

        return true;
    }
}