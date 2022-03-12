package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemGhastSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemGhastSpawnEgg() {
        super( "minecraft:ghast_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.GHAST;
    }
}