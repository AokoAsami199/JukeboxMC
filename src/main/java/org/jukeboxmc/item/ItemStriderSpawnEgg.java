package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemStriderSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemStriderSpawnEgg() {
        super( "minecraft:strider_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.STRIDER;
    }
}