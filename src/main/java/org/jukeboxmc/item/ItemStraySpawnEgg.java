package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemStraySpawnEgg extends ItemGeneralSpawnEgg {

    public ItemStraySpawnEgg() {
        super( "minecraft:stray_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.STRAY;
    }
}