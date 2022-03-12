package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemZombieVillagerSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemZombieVillagerSpawnEgg() {
        super( "minecraft:zombie_villager_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.ZOMBIE_VILLAGER;
    }
}