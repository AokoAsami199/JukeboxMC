package org.jukeboxmc.item;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemTntMinecart extends Item {

    public ItemTntMinecart() {
        super ( "minecraft:tnt_minecart" );
    }

    @Override
    public int getMaxAmount() {
        return 1;
    }
}
