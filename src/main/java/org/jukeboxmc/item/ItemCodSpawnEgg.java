package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityCod;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCodSpawnEgg extends Item {

    public ItemCodSpawnEgg() {
        super( "minecraft:cod_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityCod entityCod = new EntityCod();
        entityCod.setLocation( location.add( 0, entityCod.getEyeHeight(), 0 ) );
        entityCod.spawn();
        return true;
    }
}