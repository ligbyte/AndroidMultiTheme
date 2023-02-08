package com.ligbyte.lib.theme.widget;

import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import android.view.View;
import android.widget.CompoundButton;

import com.ligbyte.lib.theme.annotation.MultiThemeAttrs;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */
@MultiThemeAttrs({
        android.R.attr.button
})
public class CompoundButtonWidget extends TextViewWidget {

    @Override
    public void applyElementTheme(View view, @AttrRes int themeElementKey, @AnyRes int resId) {
        super.applyElementTheme(view, themeElementKey, resId);
        CompoundButton compoundButton = (CompoundButton) view;
        switch (themeElementKey) {
            case android.R.attr.button:
                setButtonDrawable(compoundButton, resId);
                break;
        }
    }

    public static void setButtonDrawable(CompoundButton compoundButton, @DrawableRes int drawableResId) {

        if (compoundButton == null) {
            return;
        }

        compoundButton.setButtonDrawable(getDrawable(compoundButton, drawableResId));
    }
}
