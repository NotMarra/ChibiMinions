package dev.notmarra.chibiminions;

import dev.notmarra.notlib.extensions.NotPlugin;

public final class ChibiMinions extends NotPlugin {

    @Override
    public void initPlugin() {
        watchResourceDirectory("minions");
    }

    @Override
    public void onPluginEnable() {
        this.getLogger().info("ChibiMinions has been enabled!");
    }

    @Override
    public void onPluginDisable() {
        this.getLogger().info("ChibiMinions has been disabled!");
    }
}
