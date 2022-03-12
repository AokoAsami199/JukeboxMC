package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCatSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemCatSpawnEgg() {
        super( "minecraft:cat_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.CAT;
    }
}