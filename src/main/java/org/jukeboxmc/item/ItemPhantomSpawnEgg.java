package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPhantomSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemPhantomSpawnEgg() {
        super( "minecraft:phantom_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.PHANTOM;
    }
}