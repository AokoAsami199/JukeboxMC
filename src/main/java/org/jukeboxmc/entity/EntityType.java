package org.jukeboxmc.entity;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.jukeboxmc.entity.item.EntityItem;
import org.jukeboxmc.entity.mob.*;
import org.jukeboxmc.entity.passive.*;
import org.jukeboxmc.entity.projectile.EntityArrow;
import org.jukeboxmc.entity.projectile.EntityEgg;
import org.jukeboxmc.entity.projectile.EntityFishingHook;
import org.jukeboxmc.entity.projectile.EntitySnowball;

/**
 * @author LucGamesYT
 * @version 1.0
 */
@AllArgsConstructor
public enum EntityType {

    HUMAN( EntityHuman.class, "minecraft:player" ),
    ITEM( EntityItem.class, "minecraft:item" ),
    ARROW( EntityArrow.class, "minecraft:arrow" ),
    SNOWBALL( EntitySnowball.class, "minecraft:snowball" ),
    FISHING_HOOK( EntityFishingHook.class, "minecraft:fishing_hook" ),
    EGG( EntityEgg.class, "minecraft:egg" ),
    CHICKEN( EntityChicken.class, "minecraft:chicken" ),
    COW( EntityCow.class, "minecraft:cow" ),
    PIG( EntityPig.class, "minecraft:pig" ),
    SHEEP( EntitySheep.class, "minecraft:sheep" ),
    WOLF( EntityWolf.class, "minecraft:wolf" ),
    VILLAGER( EntityVillager.class, "minecraft:villager" ),
    MOOSHROOM( EntityMooshroom.class, "minecraft:mooshroom" ),
    SQUID( EntitySquid.class, "minecraft:squid" ),
    RABBIT( EntityRabbit.class, "minecraft:rabbit" ),
    BAT( EntityBat.class, "minecraft:bat" ),
    IRON_GOLEM( EntityIronGolem.class, "minecraft:iron_golem" ),
    SNOW_GOLEM( EntitySnowGolem.class, "minecraft:snow:golem" ),
    OCELOT( EntityOcelot.class, "minecraft:ocelot" ),
    HORSE( EntityHorse.class, "minecraft:horse" ),
    DONKEY( EntityDonkey.class, "minecraft:donkey" ),
    MULE( EntityMule.class, "minecraft:mule" ),
    SKELETON_HORSE( EntitySkeletonHorse.class, "minecraft:skeleton_horse" ),
    ZOMBIE_HORSE( EntityZombieHorse.class, "minecraft:zombie_horse" ),
    POLAR_BEAR( EntityPolarBear.class, "minecraft:polar_bear" ),
    LLAMA( EntityLlama.class, "minecraft:llama" ),
    PARROT( EntityParrot.class, "minecraft:parrot" ),
    DOLPHIN( EntityDolphin.class, "minecraft:dolphin" ),
    TURTLE( EntityTurtle.class, "minecraft:turtle" ),
    CAT( EntityCat.class, "minecraft:cat" ),
    PUFFERFISH( EntityPufferfish.class, "minecraft:pufferfish" ),
    SALMON( EntitySalmon.class, "minecraft:salmon" ),
    TROPICAL_FISH( EntityTropicalFish.class, "minecraft:tropicalfish" ),
    COD( EntityCod.class, "minecraft:cod" ),
    PANDA( EntityPanda.class, "minecraft:panda" ),
    VILLAGER_V2( EntityVillagerV2.class, "minecraft:villager_v2" ),
    WANDERING_TRADER( EntityWanderingTrader.class, "minecraft:wandering_trader" ),
    FOX( EntityFox.class, "minecraft:fox" ),
    BEE( EntityBee.class, "minecraft:bee" ),
    STRIDER( EntityStrider.class, "minecraft:strider" ),
    GOAT( EntityGoat.class, "minecraft:goat" ),
    ZOMBIE( EntityZombie.class, "minecraft:zombie" ),
    CREEPER( EntityCreeper.class, "minecraft:creeper" ),
    SKELETON( EntitySkeleton.class, "minecraft:skeleton" ),
    SPIDER( EntitySpider.class, "minecraft:spider" ),
    ZOMBIFIED_PIGLIN( EntityZombifiedPiglin.class, "minecraft:zombie_pigman" ),
    SLIME( EntitySlime.class, "minecraft:slime" ),
    ENDERMAN( EntityEnderman.class, "minecraft:enderman" ),
    SILVERFISH( EntitySilverfish.class, "minecraft:silverfish" ),
    CAVE_SPIDER( EntityCaveSpider.class, "minecraft:cave_spider" ),
    GHAST( EntityGhast.class, "minecraft:ghast" ),
    MAGMA_CUBE( EntityMagmaCube.class, "minecraft:magma_cube" ),
    BLAZE( EntityBlaze.class, "minecraft:blaze" ),
    ZOMBIE_VILLAGER( EntityZombieVillager.class, "minecraft:zombie_villager" ),
    WITCH( EntityWitch.class, "minecraft:witch" ),
    STRAY( EntityStray.class, "minecraft:stray" ),
    HUSK( EntityHusk.class, "minecraft:husk" ),
    WITHER_SKELETON( EntityWitherSkeleton.class, "minecraft:wither_skeleton" ),
    GUARDIAN( EntityGuardian.class, "minecraft:guardian" ),
    ELDER_GUARDIAN( EntityElderGuardian.class, "minecraft:elder_guardian" ),
    WITHER( EntityWither.class, "minecraft:wither" ),
    ENDER_DRAGON( EntityEnderDragon.class, "minecraft:ender_dragon" ),
    SHULKER( EntityShulker.class, "minecraft:shulker" ),
    ENDERMITE( EntityEndermite.class, "minecraft:endermite" ),
    VINDICATOR( EntityVindicator.class, "minecraft:vindicator" ),
    PHANTOM( EntityPhantom.class, "minecraft:phantom" ),
    RAVAGER( EntityRavager.class, "minecraft:ravager" ),
    EVOKER( EntityEvoker.class, "minecraft:evocation_illager" ),
    VEX( EntityVex.class, "minecraft:vex" ),
    DROWNED( EntityDrowned.class, "minecraft:drowned" ),
    PILLAGER( EntityPillager.class, "minecraft:pillager" ),
    ZOMBIE_VILLAGER_V2( EntityZombieVillagerV2.class, "minecraft:zombie_villager_v2" ),
    PIGLIN( EntityPiglin.class, "minecraft:piglin" ),
    HOGLIN( EntityHoglin.class, "minecraft:hoglin" ),
    ZOGLIN( EntityZoglin.class, "minecraft:zoglin" ),
    PIGLIN_BRUTE( EntityPiglinBrute.class, "minecraft:piglin_brute" );

    private final Class<? extends Entity> entityClass;
    private final String identifier;

    @SneakyThrows
    public <E extends Entity> E createEntity() {
        return (E) this.entityClass.newInstance();
    }

    public String getIdentifier() {
        return this.identifier;
    }
}
