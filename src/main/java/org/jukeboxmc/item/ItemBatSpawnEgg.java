package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBatSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemBatSpawnEgg() {
        super( "minecraft:bat_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.BAT;
    }
}