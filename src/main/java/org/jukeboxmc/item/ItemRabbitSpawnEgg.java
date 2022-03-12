package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemRabbitSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemRabbitSpawnEgg() {
        super( "minecraft:rabbit_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.RABBIT;
    }
}