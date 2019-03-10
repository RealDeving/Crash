package me._real.crash.commands;

import me._real.crash.events.Crash;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CrashCommand implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] args) {

        if (!(s instanceof Player)) {
            s.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou must be a player to use this command"));
            return true;
        }
        Player p = (Player) s;

        if (args.length == 0) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cArgs: /crash <player>"));
            return true;
        }

        if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target != null) {
                Crash.crashPlayer(target);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPlayer has been crashed."));
                return true;
            }

        }


        Crash.crashPlayer(p);
        return true;
    }
}
