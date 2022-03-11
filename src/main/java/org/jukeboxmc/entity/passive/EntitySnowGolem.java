package org.jukeboxmc.entity.passive;

import org.jukeboxmc.entity.EntityLiving;
import org.jukeboxmc.entity.EntityType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntitySnowGolem extends EntityLiving {

    @Override
    public String getName() {
        return "Snow Golem";
    }

    @Override
    public float getWidth() {
        return 0.4f;
    }

    @Override
    public float getHeight() {
        return 1.8f;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SNOW_GOLEM;
    }
}