package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemParrotSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemParrotSpawnEgg() {
        super( "minecraft:parrot_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.PARROT;
    }
}