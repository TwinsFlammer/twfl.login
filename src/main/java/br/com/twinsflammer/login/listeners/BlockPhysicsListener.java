package br.com.twinsflammer.login.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * Created by @SrGutyerrez
 */
public class BlockPhysicsListener implements Listener {
    @EventHandler
    public void onBlockPhysics(BlockPhysicsEvent event) {
        event.setCancelled(true);
    }
}
