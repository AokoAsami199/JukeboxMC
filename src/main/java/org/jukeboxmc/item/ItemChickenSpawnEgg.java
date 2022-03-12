package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityChicken;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemChickenSpawnEgg extends Item {

    public ItemChickenSpawnEgg() {
        super( "minecraft:chicken_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityChicken entityChicken = new EntityChicken();
        entityChicken.setLocation( location.add( 0, entityChicken.getEyeHeight(), 0 ) );
        entityChicken.spawn();

        return true;
    }
}