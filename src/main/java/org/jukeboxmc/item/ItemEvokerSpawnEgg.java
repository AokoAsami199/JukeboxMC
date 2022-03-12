package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemEvokerSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemEvokerSpawnEgg() {
        super( "minecraft:evoker_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.EVOKER;
    }
}