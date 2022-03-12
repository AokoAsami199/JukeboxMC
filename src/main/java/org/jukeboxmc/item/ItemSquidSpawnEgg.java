package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSquidSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemSquidSpawnEgg() {
        super( "minecraft:squid_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SQUID;
    }
}