package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPandaSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemPandaSpawnEgg() {
        super( "minecraft:panda_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.PANDA;
    }
}