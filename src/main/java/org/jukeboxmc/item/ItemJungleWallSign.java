package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockJungleWallSign;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemJungleWallSign extends Item {

    public ItemJungleWallSign() {
        super ( "minecraft:jungle_wall_sign" );
    }

    @Override
    public BlockJungleWallSign getBlock() {
        return new BlockJungleWallSign();
    }

    @Override
    public int getMaxAmount() {
        return 16;
    }
}
