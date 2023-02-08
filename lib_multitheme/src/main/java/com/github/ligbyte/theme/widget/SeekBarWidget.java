package com.github.ligbyte.theme.widget;

import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import android.view.View;
import android.widget.AbsSeekBar;

import com.github.ligbyte.theme.annotation.MultiThemeAttrs;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */
@MultiThemeAttrs({
        android.R.attr.thumb
})
public class SeekBarWidget extends ProgressBarWidget {
    @Override
    public void applyElementTheme(View view, @AttrRes int themeElementKey, @AnyRes int resId) {
        super.applyElementTheme(view, themeElementKey, resId);
        AbsSeekBar seekBar = (AbsSeekBar) view;
        switch (themeElementKey) {
            case android.R.attr.thumb:
                setThumb(seekBar, resId);
                break;
        }
    }

    public static void setThumb(AbsSeekBar seekBar, @DrawableRes int drawableResId) {
        if (seekBar == null) {
            return;
        }

        seekBar.setThumb(getDrawable(seekBar, drawableResId));
    }
}
