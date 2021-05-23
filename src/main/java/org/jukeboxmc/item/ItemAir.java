package org.jukeboxmc.item;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemAir extends Item {

    public ItemAir() {
        super( -158 );
    }

    @Override
    public ItemType getItemType() {
        return ItemType.AIR;
    }

    @Override
    public int getMaxAmount() {
        return 1;
    }
}
