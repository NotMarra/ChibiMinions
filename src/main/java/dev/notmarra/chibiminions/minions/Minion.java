package dev.notmarra.chibiminions.minions;

import dev.notmarra.chibiminions.ChibiMinions;
import io.papermc.paper.math.Position;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public abstract class Minion {
    private Type type;
    private Position position;
    private OfflinePlayer owner;
    private SkullMeta skullMeta;
    private ItemMeta itemMeta;
    private ChibiMinions plugin;

    public Minion(ChibiMinions plugin) {
        this.plugin = plugin;
    }

    public abstract Minion setupMinion();

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public OfflinePlayer getOwner() {
        return owner;
    }

    public void setOwner(OfflinePlayer owner) {
        this.owner = owner;
    }

    public SkullMeta getSkullMeta() {
        return skullMeta;
    }

    public void setSkullMeta(SkullMeta skullMeta) {
        this.skullMeta = skullMeta;
    }

    public ItemMeta getItemMeta() {
        return itemMeta;
    }

    public void setItemMeta(ItemMeta itemMeta) {
        this.itemMeta = itemMeta;
    }

    public ChibiMinions getPlugin() {
        return plugin;
    }
}
