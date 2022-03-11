package org.jukeboxmc.entity.mob;

import org.jukeboxmc.entity.EntityLiving;
import org.jukeboxmc.entity.EntityType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntityWither extends EntityLiving {

    @Override
    public String getName() {
        return "Wither";
    }

    @Override
    public float getWidth() {
        return 1.0f;
    }

    @Override
    public float getHeight() {
        return 3.0f;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.WITHER;
    }
}