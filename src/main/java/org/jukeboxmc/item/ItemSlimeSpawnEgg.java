package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSlimeSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemSlimeSpawnEgg() {
        super( "minecraft:slime_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SLIME;
    }
}