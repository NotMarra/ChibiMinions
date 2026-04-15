package dev.notmarra.chibiminions.minions.types;

import com.destroystokyo.paper.profile.PlayerProfile;
import dev.notmarra.chibiminions.ChibiMinions;
import dev.notmarra.chibiminions.minions.Minion;
import dev.notmarra.notlib.chat.Text;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.List;

public class MinerMinion extends Minion {
    private FileConfiguration conf;


    public MinerMinion(ChibiMinions plugin) {
        super(plugin);
        this.conf = plugin.getSubConfig("minions/miner.yml");
    }

    @Override
    public Minion setupMinion() {
        return null;
    }

    private SkullMeta initSkullMeta() {
        SkullMeta meta = (SkullMeta) this.getSkullMeta();
        meta.displayName(Text.of(conf.getString("item.display_name", "<blue>Miner Minion")).build());
        PlayerProfile playerProfile = Bukkit.createProfile(conf.getString("item.base_skin", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE5Y2E3MWYwMzFmYzk1YmRmNGE1ZGU1M2RjNDNhNjAzYmU1YjcxZDM2OTJmZDU3M2JmODQxZTA4ZTcyNTAxYyJ9fX0="));
        meta.setPlayerProfile(playerProfile);
        return meta;
    }

    private ItemMeta createItem() {
        ItemMeta meta = (ItemMeta) this.getItemMeta();
        meta.displayName(Text.of(conf.getString("item.display_name", "<blue>Miner Minion")).build());
        meta.lore(Text.of(conf.getStringList("item.description")).build().children());
        return meta;
    }
}
