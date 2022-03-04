package io.github.colderjacket;

import org.bukkit.plugin.java.JavaPlugin;

public class NewsBoard extends JavaPlugin
{
    static NewsBoard instance;

    private static Config config;

    void NewsBoard()
    {
        instance = this;
        config = new Config();
    }

    public void onEnable()
    {
        getLogger().info("Enabled io.github.colderjacket.NewsBoard");
    }

    public void onDisable()
    {
        getLogger().info("Disabled io.github.colderjacket.NewsBoard");
    }

    public static NewsBoard getInstance()
    {
        return instance;
    }

    public static Config getInternalConfig()
    {
        return config;
    }
}
