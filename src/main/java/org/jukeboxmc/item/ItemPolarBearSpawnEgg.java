package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPolarBearSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemPolarBearSpawnEgg() {
        super( "minecraft:polar_bear_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.POLAR_BEAR;
    }
}