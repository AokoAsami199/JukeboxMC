package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemTropicalFishSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemTropicalFishSpawnEgg() {
        super( "minecraft:tropical_fish_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.TROPICAL_FISH;
    }
}