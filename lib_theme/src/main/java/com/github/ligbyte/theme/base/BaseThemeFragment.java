package com.github.ligbyte.theme.base;

import androidx.fragment.app.Fragment;

import com.github.ligbyte.theme.ThemeViewEntities;

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
