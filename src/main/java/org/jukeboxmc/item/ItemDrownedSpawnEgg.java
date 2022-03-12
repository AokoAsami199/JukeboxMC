package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemDrownedSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemDrownedSpawnEgg() {
        super( "minecraft:drowned_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.DROWNED;
    }
}