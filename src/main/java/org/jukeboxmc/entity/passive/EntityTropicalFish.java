package org.jukeboxmc.entity.passive;

import org.jukeboxmc.entity.EntityLiving;
import org.jukeboxmc.entity.EntityType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntityTropicalFish extends EntityLiving {

    @Override
    public String getName() {
        return "Tropical Fish";
    }

    @Override
    public float getWidth() {
        return 0.52f;
    }

    @Override
    public float getHeight() {
        return 0.52f;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.TROPICAL_FISH;
    }
}