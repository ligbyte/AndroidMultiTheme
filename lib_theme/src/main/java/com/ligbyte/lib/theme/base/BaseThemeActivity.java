package com.ligbyte.lib.theme.base;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.ligbyte.lib.theme.ActivityTheme;
import com.ligbyte.lib.theme.DarkMode;
import com.ligbyte.lib.theme.MultiTheme;
import com.ligbyte.lib.theme.ThemeViewEntities;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */

public abstract class BaseThemeActivity extends AppCompatActivity {

    private final static String TAG = BaseThemeActivity.class.getSimpleName();
    private ActivityTheme activityTheme = new ActivityTheme(this);
    private ThemeViewEntities themeViewEntities = new ThemeViewEntities();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTheme();
        super.onCreate(savedInstanceState);
    }

    private void initTheme() {
        configTheme(activityTheme);
        activityTheme.assembleThemeBeforeInflate();
    }

    /**
     * 配置Activity的主题
     *
     * @param activityTheme Activity主题
     */
    protected abstract void configTheme(ActivityTheme activityTheme);

    public final ThemeViewEntities getThemeViewEntities() {
        return this.themeViewEntities;
    }

    /**
     * 设置StatusBar的背景色
     *
     * @param color Color
     */
    public void setStatusBarColor(int color) {
        this.activityTheme.setStatusBarColor(color);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        DarkMode mode = MultiTheme.getDarkMode();
        if (mode == DarkMode.followSystem) {
            int uiMode = newConfig.uiMode & Configuration.UI_MODE_NIGHT_MASK;
            if (uiMode == Configuration.UI_MODE_NIGHT_YES) {
                MultiTheme.d("MultiTheme", "onConfigurationChanged mode:UI_MODE_NIGHT_YES");
                MultiTheme.setAppTheme(MultiTheme.DARK_THEME);
            } else {
                MultiTheme.d("MultiTheme", "onConfigurationChanged mode:UI_MODE_NIGHT_NO");
                MultiTheme.setAppTheme(MultiTheme.sDefaultThemeIndex);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (activityTheme != null) {
            activityTheme.destroy();
            activityTheme = null;
        }

        themeViewEntities.clear();
    }

}
