package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCowSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemCowSpawnEgg() {
        super( "minecraft:cow_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.COW;
    }
}