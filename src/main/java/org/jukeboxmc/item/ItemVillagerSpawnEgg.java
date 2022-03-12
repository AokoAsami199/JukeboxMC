package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemVillagerSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemVillagerSpawnEgg() {
        super( "minecraft:villager_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.VILLAGER;
    }
}