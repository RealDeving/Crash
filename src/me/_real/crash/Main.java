package me._real.crash;

import me._real.crash.commands.CrashCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        getCommand("crash").setExecutor(new CrashCommand());
    }

}
