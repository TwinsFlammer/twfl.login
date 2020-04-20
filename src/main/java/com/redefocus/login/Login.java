package com.redefocus.login;

import com.redefocus.api.spigot.FocusPlugin;
import com.redefocus.login.manager.StartManager;
import lombok.Getter;
import org.bukkit.Server;

/**
 * Created by @SrGutyerrez
 */
public class Login extends FocusPlugin {
    @Getter
    private static Login instance;

    public Login() {
        Login.instance = this;
    }

    @Override
    public void onEnablePlugin() {
        new StartManager();

        Server server = this.getServer();

        server.getWorlds().forEach(world -> {
            world.setGameRuleValue("randomTickSpeed", "-999");
            world.setGameRuleValue("doFireTick", "false");
            world.setGameRuleValue("doDaylightCycle", "false");

            world.setTime(1200);
        });
    }

    @Override
    public void onDisablePlugin() {
    }
}
