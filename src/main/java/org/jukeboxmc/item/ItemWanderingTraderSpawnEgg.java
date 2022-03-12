package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.passive.EntityWanderingTrader;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemWanderingTraderSpawnEgg extends Item {

    public ItemWanderingTraderSpawnEgg() {
        super( "minecraft:wandering_trader_spawn_egg" );
    }

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        EntityWanderingTrader entityWanderingTrader = new EntityWanderingTrader();
        entityWanderingTrader.setLocation( location.add( 0, entityWanderingTrader.getEyeHeight(), 0 ) );
        entityWanderingTrader.spawn();

        return true;
    }
}