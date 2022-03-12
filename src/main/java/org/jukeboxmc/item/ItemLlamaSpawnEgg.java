package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemLlamaSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemLlamaSpawnEgg() {
        super( "minecraft:llama_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.LLAMA;
    }
}