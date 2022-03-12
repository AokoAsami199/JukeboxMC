package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemHorseSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemHorseSpawnEgg() {
        super( "minecraft:horse_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.HORSE;
    }
}