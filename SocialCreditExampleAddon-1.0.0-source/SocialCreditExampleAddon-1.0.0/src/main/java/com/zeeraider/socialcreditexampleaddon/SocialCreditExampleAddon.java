package com.zeeraider.socialcreditexampleaddon;

import com.zeeraider.socialcreditexampleaddon.listener.PreChangeListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialCreditExampleAddon extends JavaPlugin {

    @Override
    public void onEnable() {
        if (getServer().getPluginManager().getPlugin("SocialCredit") == null) {
            getLogger().severe("SocialCredit is required. Disabling addon.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        getServer().getPluginManager().registerEvents(new PreChangeListener(), this);
        getLogger().info("SocialCreditExampleAddon enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("SocialCreditExampleAddon disabled.");
    }
}
