package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSilverfishSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemSilverfishSpawnEgg() {
        super( "minecraft:silverfish_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SILVERFISH;
    }
}