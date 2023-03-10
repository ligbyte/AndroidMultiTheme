package com.ligbyte.lib.theme.samples;

import android.app.Application;

import com.ligbyte.lib.theme.MultiTheme;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */

public class ThemeApplication extends Application {

    static Application sApp;

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
        initTheme();
    }

    private void initTheme() {
        MultiTheme.init(this);
        MultiTheme.enableDebug();
        MultiTheme.setDefaultAppTheme(0);
    }
}
