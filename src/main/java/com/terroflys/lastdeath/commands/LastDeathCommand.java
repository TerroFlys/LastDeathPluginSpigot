package com.terroflys.lastdeath.commands;

import com.terroflys.lastdeath.util.DataHandlers;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LastDeathCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            String lastDeath = DataHandlers.getLastDeath(player.getUniqueId());
            if (lastDeath != null) {
                player.sendMessage(lastDeath);
            } else {
                player.sendMessage("No deaths have been recorded!");
            }
        } else {
            sender.sendMessage("You must be a player to use this command!");
        }
        return true;
    }
}
