package com.redecommunity.login.listeners;

import com.redecommunity.login.spawn.manager.SpawnManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by @SrGutyerrez
 */
public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Bukkit.getOnlinePlayers().forEach(player1 -> {
            player1.hidePlayer(player);
            player.hidePlayer(player1);
        });

        Location location = SpawnManager.DEFAULT_SPAWN;

        if (location != null) player.teleport(location);
    }
}
