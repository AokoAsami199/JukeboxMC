package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemZombieHorseSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemZombieHorseSpawnEgg() {
        super( "minecraft:zombie_horse_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.ZOMBIE_HORSE;
    }
}