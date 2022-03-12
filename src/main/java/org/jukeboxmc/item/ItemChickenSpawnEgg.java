package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemChickenSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemChickenSpawnEgg() {
        super( "minecraft:chicken_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.CHICKEN;
    }
}