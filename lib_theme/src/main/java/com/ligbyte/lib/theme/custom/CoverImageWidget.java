package com.ligbyte.lib.theme.custom;

import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import android.view.View;

import com.ligbyte.lib.theme.R;
import com.ligbyte.lib.theme.base.widget.CoverImageView;
import com.ligbyte.lib.theme.widget.ImageViewWidget;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */

public class CoverImageWidget extends ImageViewWidget {

    @Override
    protected void initializeLibraryElements() {
        super.initializeLibraryElements();
        addThemeElementKey(R.attr.coverColor);
    }

    @Override
    public void applyElementTheme(View view, @AttrRes int themeElementKey, @AnyRes int resId) {
        super.applyElementTheme(view, themeElementKey, resId);
        CoverImageView coverImageView = (CoverImageView) view;
        if (R.attr.coverColor == themeElementKey) {
            setCoverColor(coverImageView, resId);
        }
    }

    public static void setCoverColor(CoverImageView coverImageView, @ColorRes int colorResId) {

        if (coverImageView == null) {
            return;
        }

        coverImageView.setCoverColor(getColor(coverImageView, colorResId));
    }
}
