package org.jukeboxmc.item;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemSaddle extends Item {

    public ItemSaddle() {
        super ( "minecraft:saddle" );
    }

    @Override
    public int getMaxAmount() {
        return 1;
    }
}
