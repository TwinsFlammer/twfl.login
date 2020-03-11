package com.redecommunity.login.manager;

import com.redecommunity.common.shared.databases.mysql.dao.Table;
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

        new TableManager();
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

class TableManager {
    TableManager() {
        ClassGetter.getClassesForPackage(Login.class)
                .forEach(clazz -> {
                    if (Table.class.isAssignableFrom(clazz)) {
                        try {
                            Table table = (Table) clazz.newInstance();

                            table.createTable();
                        } catch (InstantiationException | IllegalAccessException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
    }
}