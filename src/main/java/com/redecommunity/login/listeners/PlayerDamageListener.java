package com.redecommunity.login.listeners;

import com.redecommunity.login.spawn.manager.SpawnManager;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 * Created by @SrGutyerrez
 */
public class PlayerDamageListener implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        Entity entity = event.getEntity();

        if (entity instanceof Player) {
            EntityDamageEvent.DamageCause cause = event.getCause();

            if (cause == EntityDamageEvent.DamageCause.VOID) {
                event.setCancelled(true);

                Location location = SpawnManager.DEFAULT_SPAWN;

                entity.teleport(location);
            }
        }
    }
}
