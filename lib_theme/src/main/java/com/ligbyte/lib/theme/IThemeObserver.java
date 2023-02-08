package com.ligbyte.lib.theme;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */

public interface IThemeObserver extends Comparable<IThemeObserver> {

    int PRIORITY_ACTIVITY = 1;
    int PRIORITY_VIEW = 2;

    int getPriority();

    void onThemeChanged(int whichTheme);
}
