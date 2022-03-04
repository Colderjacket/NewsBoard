package io.github.colderjacket;

import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;

public final class Config
{
    public static final String INVENTORY_NAME = "inventory.name";
    private String inventoryName;

    public void loadConfig()
    {
        FileConfiguration config = NewsBoard.getInstance().getConfig();
        inventoryName = config.getString(INVENTORY_NAME, "News Board");
    }

    public void setDefaults()
    {
        FileConfiguration config = NewsBoard.getInstance().getConfig();
        config.addDefault(INVENTORY_NAME, "News Board");
    }

    public String getInventoryName()
    {
        return inventoryName;
    }

}
