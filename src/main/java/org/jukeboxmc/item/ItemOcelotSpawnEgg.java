package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemOcelotSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemOcelotSpawnEgg() {
        super( "minecraft:ocelot_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.OCELOT;
    }
}