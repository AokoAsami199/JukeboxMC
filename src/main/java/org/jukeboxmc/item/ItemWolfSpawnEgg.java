package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemWolfSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemWolfSpawnEgg() {
        super( "minecraft:wolf_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.WOLF;
    }
}