package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPufferfishSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemPufferfishSpawnEgg() {
        super( "minecraft:pufferfish_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.PUFFERFISH;
    }
}