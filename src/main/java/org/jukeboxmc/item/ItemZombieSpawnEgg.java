package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemZombieSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemZombieSpawnEgg() {
        super( "minecraft:zombie_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.ZOMBIE;
    }
}