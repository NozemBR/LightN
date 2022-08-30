package me.nozembr;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin {

    public void onEnable() {


        Bukkit.getConsoleSender().sendMessage("§a[LightN] Plugin load.");

    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[LightN] Plugin unload.");

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (label.equalsIgnoreCase("light")) {//Se o cara for player vai digitar
            Player p = (Player) sender;

            if (p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                p.sendMessage("§cYou turn off night vision");

            } else {
                p.addPotionEffect(PotionEffectType.NIGHT_VISION.createEffect(999999999,2));
                p.sendMessage("§aYou turn on night vision");
            }
        }
        return true;
    }
}