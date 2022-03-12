package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemFoxSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemFoxSpawnEgg() {
        super( "minecraft:fox_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.FOX;
    }
}