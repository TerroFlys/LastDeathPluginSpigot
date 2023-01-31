package com.terroflys.lastdeath.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import static com.terroflys.lastdeath.util.DataHandlers.saveLastDeath;

public class DeathListener implements Listener {
    private String getWorldDisplayName(String technicalName) {
        switch (technicalName) {
            case "NETHER":
                return "Nether";
            case "THE_END":
                return "The End";
            default:
                return "Overworld";
        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        //LOG TO CONSOLE EVEN IF THEY DO NOT HAVE PERMISSION
        event.getEntity().getServer().getLogger().info(event.getEntity().getName() + " has died at " + "[X: " +
                event.getEntity().getLocation().getBlockX() + ", Y: " + event.getEntity().getLocation().getBlockY() + ", Z: " +
                event.getEntity().getLocation().getBlockZ() + "] " + " in the "
                + getWorldDisplayName(event.getEntity().getWorld().getEnvironment().name()) + ".");


        //This line shows colors
        String lastdeath = ChatColor.GREEN + "You have died at " + ChatColor.RED + "[X: " +
                event.getEntity().getLocation().getBlockX() + ", Y: " + event.getEntity().getLocation().getBlockY() + ", Z: " + event.getEntity().getLocation().getBlockZ() + "] " + ChatColor.GREEN + " in the "
                + ChatColor.RED + getWorldDisplayName(event.getEntity().getWorld().getEnvironment().name()) + ChatColor.GREEN + ".";
        //SAVE INSIDE PLUGIN's UTILS

        //RECORD DEATH EVEN WITHOUT ACTIVE PERMISSION
        saveLastDeath(event.getEntity().getUniqueId(), lastdeath);

        //if player does not have permission, do not send message
        if (!event.getEntity().getPlayer().hasPermission("lastdeath.notify")) return;


        //SEND TO PLAYER
        event.getEntity().sendMessage(lastdeath);

    }
}
