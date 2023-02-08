package com.ligbyte.lib.theme.base;

import androidx.fragment.app.Fragment;

import com.ligbyte.lib.theme.ThemeViewEntities;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */

public class BaseThemeFragment extends Fragment {

    private ThemeViewEntities themeViewEntities = new ThemeViewEntities();

    public ThemeViewEntities getThemeViewEntities() {
        return themeViewEntities;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        themeViewEntities.clear();
    }
}
