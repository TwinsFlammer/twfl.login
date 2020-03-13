package com.redecommunity.login.listeners;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

/**
 * Created by @SrGutyerrez
 */
public class EntityChangeBlockListener implements Listener {
    @EventHandler
    public void onChange(EntityChangeBlockEvent event) {
        Entity entity = event.getEntity();
        Block block = event.getBlock();

        if (entity.getType() == EntityType.FALLING_BLOCK) {
            BlockState blockState = block.getState();

            blockState.update();

            entity.remove();

            blockState.update();

            event.setCancelled(true);

            blockState.update();
        }
    }
}
