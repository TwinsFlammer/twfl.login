package com.redefocus.login;

import com.redefocus.api.spigot.FocusPlugin;
import com.redefocus.common.shared.databases.mysql.data.MySQL;
import com.redefocus.login.manager.StartManager;
import lombok.Getter;
import org.json.simple.JSONObject;

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
    }

    @Override
    public void onDisablePlugin() {

    }
}
