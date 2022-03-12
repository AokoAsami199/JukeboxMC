package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemHuskSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemHuskSpawnEgg() {
        super( "minecraft:husk_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.HUSK;
    }
}