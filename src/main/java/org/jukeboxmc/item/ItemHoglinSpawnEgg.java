package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemHoglinSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemHoglinSpawnEgg() {
        super( "minecraft:hoglin_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.HOGLIN;
    }
}