package de.softwarerat.bansystemspigot;

import com.softwarerat.Bansystem;
import com.softwarerat.MySQL.Ban;
import org.bukkit.plugin.java.JavaPlugin;

public final class BansystemSpigot extends JavaPlugin {
    Ban ban;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bansystem bansystem = new Bansystem();
        bansystem.enableAPI("Admin","GGoders0","127.0.0.1","BanSystem");
        ban = bansystem.getBan();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
