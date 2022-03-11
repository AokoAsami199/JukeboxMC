package org.jukeboxmc.entity.mob;

import org.jukeboxmc.entity.EntityLiving;
import org.jukeboxmc.entity.EntityType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntityEnderDragon extends EntityLiving {

    @Override
    public String getName() {
        return "EnderDragon";
    }

    @Override
    public float getWidth() {
        return 16f;
    }

    @Override
    public float getHeight() {
        return 8f;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.ENDER_DRAGON;
    }
}