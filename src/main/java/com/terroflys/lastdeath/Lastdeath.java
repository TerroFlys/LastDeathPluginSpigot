package com.terroflys.lastdeath;

import com.terroflys.lastdeath.commands.LastDeathCommand;
import com.terroflys.lastdeath.listeners.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lastdeath extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new DeathListener(), this);
        this.getCommand("lastdeath").setExecutor(new LastDeathCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
