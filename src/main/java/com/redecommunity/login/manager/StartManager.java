package com.redecommunity.login.manager;

import com.redecommunity.common.shared.util.ClassGetter;
import com.redecommunity.login.Login;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

/**
 * Created by @SrGutyerrez
 */
public class StartManager {
    public StartManager() {
        new ListenerManager();
    }
}

class ListenerManager {
    ListenerManager() {
        ClassGetter.getClassesForPackage(Login.class)
                .forEach(clazz -> {
                    if (Listener.class.isAssignableFrom(clazz)) {
                        try {
                            Listener listener = (Listener) clazz.newInstance();

                            Bukkit.getPluginManager().registerEvents(
                                    listener,
                                    Login.getInstance()
                            );
                        } catch (InstantiationException | IllegalAccessException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
    }
}