package io.github.runcows.paintingRotate;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PaintingRotate extends JavaPlugin {
    private static PaintingRotate instance;
    public static PaintingRotate getInstance() {return instance;}
    public PaintingRotate() {instance = this;}

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new InteractEntityListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
