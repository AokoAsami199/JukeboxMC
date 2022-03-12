package org.jukeboxmc.item;

import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.entity.Entity;
import org.jukeboxmc.entity.EntityType;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;

/**
 * @author Kaooot
 * @version 1.0
 */
public abstract class ItemGeneralSpawnEgg extends Item {

    public ItemGeneralSpawnEgg( String identifier ) {
        super( identifier );
    }

    public abstract EntityType getEntityType();

    @Override
    public boolean interact( Player player, BlockFace blockFace, Vector clickedVector, Block clickedBlock ) {
        Location location = clickedBlock.getLocation();

        Entity entity = this.getEntityType().createEntity();
        entity.setLocation( location.add( 0.5f, 1f, 0.5f ) );
        entity.spawn();

        return true;
    }
}