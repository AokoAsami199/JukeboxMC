package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemWitherSkeletonSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemWitherSkeletonSpawnEgg() {
        super( "minecraft:wither_skeleton_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.WITHER_SKELETON;
    }
}