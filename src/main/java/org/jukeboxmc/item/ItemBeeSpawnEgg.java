package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBeeSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemBeeSpawnEgg() {
        super( "minecraft:bee_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.BEE;
    }
}