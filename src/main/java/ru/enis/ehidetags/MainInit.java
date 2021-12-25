package ru.enis.ehidetags;

import org.bukkit.Bukkit;
import ru.enis.ehidetags.commands.cmdInit;
import ru.enis.ehidetags.events.EventInit;
import ru.enis.ehidetags.misc.configs.Config;
import ru.enis.ehidetags.misc.configs.ConfigInit;
import ru.enis.ehidetags.misc.other;

public class MainInit {

    public MainInit(Core plugin){
        new ConfigInit(plugin);
        other.boardSettings();
        new EventInit(plugin);
        new cmdInit(plugin);
        if (!Bukkit.getOnlinePlayers().isEmpty()) {
            Bukkit.getOnlinePlayers().forEach(other::hideName);
        }

        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§6eHideTags §f| §aSuccessfully enabled");
        Bukkit.getConsoleSender().sendMessage("§6eHideTags §f| §aBy: §fvk.com/rogablik");
        Bukkit.getConsoleSender().sendMessage("");
    }
}