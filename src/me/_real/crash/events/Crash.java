package me._real.crash.events;

import net.minecraft.server.v1_7_R4.EntityPlayer;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class Crash {

    public static void crashPlayer(Player p) {
        Inventory inv = Bukkit.createInventory(null, Integer.MAX_VALUE);
        p.openInventory(inv);

    }

}