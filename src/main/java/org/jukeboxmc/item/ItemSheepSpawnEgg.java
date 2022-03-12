package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSheepSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemSheepSpawnEgg() {
        super( "minecraft:sheep_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SHEEP;
    }
}