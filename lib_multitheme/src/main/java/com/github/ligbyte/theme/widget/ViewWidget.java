package com.github.ligbyte.theme.widget;

import android.graphics.drawable.Drawable;
import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import android.view.View;

import com.github.ligbyte.theme.ThemeUtils;
import com.github.ligbyte.theme.annotation.MultiThemeAttrs;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */
@MultiThemeAttrs({
        android.R.attr.background
})
public class ViewWidget extends AbstractThemeWidget {

    @Override
    protected void initializeLibraryElements() {
        super.initializeLibraryElements();
    }

    @Override
    public void applyElementTheme(View view, @AttrRes int themeElementKey, @AnyRes int resId) {
        super.applyElementTheme(view, themeElementKey, resId);
        switch (themeElementKey) {
            case android.R.attr.background:
                setBackground(view, resId);
                break;
        }
    }

    @SuppressWarnings("NewApi")
    public static void setBackground(View view, @AnyRes int resId) {
        if (view == null) {
            return;
        }

        Drawable background = getDrawable(view, resId);

        if (ThemeUtils.IS_JELLY_BEAN) {
            view.setBackground(background);
        } else {
            view.setBackgroundDrawable(background);
        }
    }

}
