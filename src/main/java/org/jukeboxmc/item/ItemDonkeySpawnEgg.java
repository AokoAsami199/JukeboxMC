package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemDonkeySpawnEgg extends ItemGeneralSpawnEgg {

    public ItemDonkeySpawnEgg() {
        super( "minecraft:donkey_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.DONKEY;
    }
}