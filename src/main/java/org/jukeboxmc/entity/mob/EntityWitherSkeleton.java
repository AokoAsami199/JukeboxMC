package org.jukeboxmc.entity.mob;

import org.jukeboxmc.entity.EntityLiving;
import org.jukeboxmc.entity.EntityType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntityWitherSkeleton extends EntityLiving {

    @Override
    public String getName() {
        return "WitherSkeleton";
    }

    @Override
    public float getWidth() {
        return 0.864f;
    }

    @Override
    public float getHeight() {
        return 2.412f;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.WITHER_SKELETON;
    }
}