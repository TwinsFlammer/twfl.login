package com.redefocus.login.spawn.command;

import com.redefocus.api.spigot.commands.CustomCommand;
import com.redefocus.api.spigot.commands.enums.CommandRestriction;
import com.redefocus.api.spigot.util.serialize.LocationSerialize;
import com.redefocus.common.shared.permissions.group.GroupNames;
import com.redefocus.common.shared.permissions.user.data.User;
import com.redefocus.login.spawn.storage.SpawnStorage;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by @SrGutyerrez
 */
public class SetSpawnCommand extends CustomCommand {
    public SetSpawnCommand() {
        super("setspawn", CommandRestriction.IN_GAME, GroupNames.MANAGER);
    }

    @Override
    public void onCommand(CommandSender sender, User user, String[] args) {
        Player player = (Player) sender;

        Location location = player.getLocation();

        String serializedLocation = LocationSerialize.toString(location);

        SpawnStorage spawnStorage = new SpawnStorage();
    }
}
