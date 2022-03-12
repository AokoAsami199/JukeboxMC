package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCaveSpiderSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemCaveSpiderSpawnEgg() {
        super( "minecraft:cave_spider_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.CAVE_SPIDER;
    }
}