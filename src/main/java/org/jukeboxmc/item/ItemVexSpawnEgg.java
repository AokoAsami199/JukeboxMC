package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemVexSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemVexSpawnEgg() {
        super( "minecraft:vex_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.VEX;
    }
}