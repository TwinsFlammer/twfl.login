package com.redecommunity.login.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Created by @SrGutyerrez
 */
public class PlayerMoveListener implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        Location toLocation = event.getTo();
        Location fromLocation = event.getFrom();

        if (fromLocation.getX() == toLocation.getX()
                || fromLocation.getY() == toLocation.getY()
                || fromLocation.getZ() == toLocation.getZ()) return;

        player.teleport(fromLocation);
    }
}
