package com.zeeraider.socialcreditexampleaddon.listener;

import com.example.socialcredit.api.event.SocialCreditPreChangeEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public final class PreChangeListener implements Listener {

    private static final int MAX_NEGATIVE_DELTA = -10;
    private static final String BLOCKED_REASON = "Forbidden override";

    @EventHandler
    public void onSocialCreditPreChange(SocialCreditPreChangeEvent event) {
        if (BLOCKED_REASON.equalsIgnoreCase(event.getReason())) {
            event.setCancelled(true);
            return;
        }

        if (event.getDelta() < MAX_NEGATIVE_DELTA) {
            event.setDelta(MAX_NEGATIVE_DELTA);
            event.setReason("Penalty capped by SocialCreditExampleAddon");
        }
    }
}
