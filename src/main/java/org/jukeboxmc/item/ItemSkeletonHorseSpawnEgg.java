package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSkeletonHorseSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemSkeletonHorseSpawnEgg() {
        super( "minecraft:skeleton_horse_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SKELETON_HORSE;
    }
}