package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemWanderingTraderSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemWanderingTraderSpawnEgg() {
        super( "minecraft:wandering_trader_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.WANDERING_TRADER;
    }
}