package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemZoglinSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemZoglinSpawnEgg() {
        super( "minecraft:zoglin_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.ZOGLIN;
    }
}