package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemPiglinBruteSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemPiglinBruteSpawnEgg() {
        super( "minecraft:piglin_brute_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.PIGLIN_BRUTE;
    }
}