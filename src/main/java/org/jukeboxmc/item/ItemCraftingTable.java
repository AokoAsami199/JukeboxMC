package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockCraftingTable;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemCraftingTable extends Item {

    public ItemCraftingTable() {
        super(  58 );
    }

    @Override
    public BlockCraftingTable getBlock() {
        return new BlockCraftingTable();
    }
}
