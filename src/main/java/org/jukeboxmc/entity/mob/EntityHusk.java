package org.jukeboxmc.entity.mob;

import org.jukeboxmc.entity.EntityLiving;
import org.jukeboxmc.entity.EntityType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntityHusk extends EntityLiving {

    @Override
    public String getName() {
        return "Husk";
    }

    @Override
    public float getWidth() {
        return 0.6375f;
    }

    @Override
    public float getHeight() {
        return 2.01875f;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.HUSK;
    }
}