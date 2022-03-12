package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemTurtleSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemTurtleSpawnEgg() {
        super( "minecraft:turtle_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.TURTLE;
    }
}