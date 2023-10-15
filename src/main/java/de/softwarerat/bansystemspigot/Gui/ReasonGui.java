package de.softwarerat.bansystemspigot.Gui;

import com.github.stefvanschie.inventoryframework.adventuresupport.ComponentHolder;
import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.OutlinePane;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import de.softwarerat.bansystemspigot.Api.ItemBuilder;
import de.softwarerat.bansystemspigot.Api.MiliCalc;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class ReasonGui {
    GuiData guiData;
    MiliCalc miliCalc;
    MainGUI mainGUI;


    public ReasonGui(GuiData guiData, MiliCalc miliCalc, MainGUI mainGUI) {
        this.guiData = guiData;
        this.miliCalc = miliCalc;
        this.mainGUI = mainGUI;
    }

    public void showReasonGUI(Player player, String playerName) {
        ChestGui chestGui = new ChestGui(6, ComponentHolder.of(Component.text("Ban")));

        chestGui.setOnGlobalClick(clickEvent -> clickEvent.setCancelled(true));

        OutlinePane settingPane = new OutlinePane(1, 1, 1, 1, Pane.Priority.HIGH);


        settingPane.addItem(new GuiItem(new  ItemBuilder(Material.CLOCK).setDisplayname("Grund Hacking").build(), inventoryClickEvent -> {
            mainGUI.showMainGUI(player, playerName);
            guiData.setReason("Hacking");
        }));
        settingPane.addItem(new GuiItem(new  ItemBuilder(Material.CLOCK).setDisplayname("Grund Teaming").build(), inventoryClickEvent -> {
            guiData.setReason("Teaming");
            inventoryClickEvent.getInventory().close();
            mainGUI.showMainGUI(player, playerName);
        }));
        settingPane.addItem(new GuiItem(new  ItemBuilder(Material.CLOCK).setDisplayname("Hausverbot").build(), inventoryClickEvent -> {
            guiData.setReason("Hausverbot");
            inventoryClickEvent.getInventory().close();

        }));
        settingPane.addItem(new GuiItem(new  ItemBuilder(Material.CLOCK).setDisplayname("Trolling").build(), inventoryClickEvent -> {
            guiData.setReason("Trolling");
            inventoryClickEvent.getInventory().close();
            mainGUI.showMainGUI(player, playerName);
        }));

        settingPane.addItem(new GuiItem(new ItemBuilder(Material.ACACIA_SIGN).setDisplayname("Andere Gründe kann man über /bungeeban <Spieler> <Grund> <Zeit> verwenden.").build()));
        settingPane.align(OutlinePane.Alignment.CENTER);

        chestGui.addPane(settingPane);

        OutlinePane background = new OutlinePane(0, 0, 9, 6, Pane.Priority.LOWEST);
        background.addItem(new GuiItem(new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").build()));
        background.setRepeat(true);

        chestGui.addPane(background);

        chestGui.show(player);
    }
}
