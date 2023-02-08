package com.ligbyte.lib.theme.widget;

import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import android.view.View;
import android.widget.LinearLayout;

import com.ligbyte.lib.theme.annotation.MultiThemeAttrs;


/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */
@MultiThemeAttrs({
        android.R.attr.divider
})
public class LinearLayoutWidget extends ViewWidget {
    @Override
    public void applyElementTheme(View view, @AttrRes int themeElementKey, @AnyRes int resId) {
        super.applyElementTheme(view, themeElementKey, resId);
        LinearLayout linearLayout = (LinearLayout) view;
        switch (themeElementKey) {
            case android.R.attr.divider:
                setDividerDrawable(linearLayout, resId);
                break;
        }
    }

    public static void setDividerDrawable(LinearLayout linearLayout, @DrawableRes int drawableResId) {
        if (linearLayout == null) {
            return;
        }

        linearLayout.setDividerDrawable(getDrawable(linearLayout,drawableResId));
    }
}
