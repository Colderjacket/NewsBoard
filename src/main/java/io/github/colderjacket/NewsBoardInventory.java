package io.github.colderjacket;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NewsBoardInventory implements Listener
{
    static Inventory newsInventory;
    private ItemStack[] inventoryContent;

    void NewsBoardInventory()
    {
        newsInventory = Bukkit.createInventory(null, 54, NewsBoard.getInternalConfig().getInventoryName());
    }
}
