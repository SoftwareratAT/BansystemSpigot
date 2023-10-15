package de.softwarerat.bansystemspigot.Commands;

import com.github.stefvanschie.inventoryframework.adventuresupport.ComponentHolder;
import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.OutlinePane;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import com.softwarerat.MySQL.Ban;
import de.softwarerat.bansystemspigot.Api.ItemBuilder;
import de.softwarerat.bansystemspigot.Api.MiliCalc;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BanCommand implements CommandExecutor {
    Ban ban;
    MiliCalc miliCalc;

    public BanCommand(Ban ban, MiliCalc miliCalc) {
        this.ban = ban;
        this.miliCalc = miliCalc;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        return false;
    }


}
