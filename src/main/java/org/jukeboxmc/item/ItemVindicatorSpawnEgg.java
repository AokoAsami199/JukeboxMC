package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemVindicatorSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemVindicatorSpawnEgg() {
        super( "minecraft:vindicator_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.VINDICATOR;
    }
}