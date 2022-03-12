package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBlazeSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemBlazeSpawnEgg() {
        super( "minecraft:blaze_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.BLAZE;
    }
}