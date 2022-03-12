package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemMuleSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemMuleSpawnEgg() {
        super( "minecraft:mule_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.MULE;
    }
}