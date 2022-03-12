package org.jukeboxmc.item;

import org.jukeboxmc.entity.EntityType;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemMagmaCubeSpawnEgg extends ItemGeneralSpawnEgg {

    public ItemMagmaCubeSpawnEgg() {
        super( "minecraft:magma_cube_spawn_egg" );
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.MAGMA_CUBE;
    }
}