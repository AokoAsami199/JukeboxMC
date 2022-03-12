package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityPig;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPigSpawnEgg extends Item {

    public ItemPigSpawnEgg() {
        super ( "minecraft:pig_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityPig entityPig = new EntityPig();
        entityPig.setLocation( location.add( 0, entityPig.getEyeHeight(), 0 ) );
        entityPig.spawn();
        return true;
    }
}