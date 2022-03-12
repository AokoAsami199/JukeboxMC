package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSalmonSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemSalmonSpawnEgg() {
        super( "minecraft:salmon_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SALMON;
    }
}