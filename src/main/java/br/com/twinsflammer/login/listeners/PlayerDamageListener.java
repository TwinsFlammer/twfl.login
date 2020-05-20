package br.com.twinsflammer.login.listeners;

import br.com.twinsflammer.api.spigot.spawn.manager.SpawnManager;
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

            event.setCancelled(true);

            if (cause == EntityDamageEvent.DamageCause.VOID) {

                Location location = SpawnManager.DEFAULT_SPAWN;

                if (location != null) entity.teleport(location);
            }
        }
    }
}
