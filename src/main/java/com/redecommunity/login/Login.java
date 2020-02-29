package com.redecommunity.login;

import com.redecommunity.api.spigot.CommunityPlugin;
import com.redecommunity.login.manager.StartManager;
import lombok.Getter;

/**
 * Created by @SrGutyerrez
 */
public class Login extends CommunityPlugin {
    @Getter
    private static Login instance;

    public Login() {
        Login.instance = this;
    }

    @Override
    public void onEnablePlugin() {
        new StartManager();
    }

    @Override
    public void onDisablePlugin() {
    }
}
