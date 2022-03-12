package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemMooshroomSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemMooshroomSpawnEgg() {
        super( "minecraft:mooshroom_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.MOOSHROOM;
    }
}