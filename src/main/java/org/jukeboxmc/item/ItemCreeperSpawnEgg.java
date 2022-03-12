package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCreeperSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemCreeperSpawnEgg() {
        super( "minecraft:creeper_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.CREEPER;
    }
}