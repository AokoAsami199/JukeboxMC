package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemEndermiteSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemEndermiteSpawnEgg() {
        super( "minecraft:endermite_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.ENDERMITE;
    }
}