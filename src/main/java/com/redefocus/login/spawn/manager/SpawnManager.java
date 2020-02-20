package com.redefocus.login.spawn.manager;

import com.redefocus.login.spawn.storage.SpawnStorage;
import org.bukkit.Location;

/**
 * Created by @SrGutyerrez
 */
public class SpawnManager {
    private static Location DEFAULT_SPAWN;

    public SpawnManager() {
        SpawnStorage spawnStorage = new SpawnStorage();

        Location location = spawnStorage.findOne();
    }
}
