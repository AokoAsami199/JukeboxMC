package org.jukeboxmc.entity.mob;

import org.jukeboxmc.entity.EntityLiving;
import org.jukeboxmc.entity.EntityType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntitySlime extends EntityLiving {

    @Override
    public String getName() {
        return "Slime";
    }

    @Override
    public float getWidth() {
        return 2.0808f;
    }

    @Override
    public float getHeight() {
        return 2.0808f;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SLIME;
    }
}