package com.github.ligbyte.theme.custom;

import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import android.view.View;

import com.github.ligbyte.theme.R;
import com.github.ligbyte.theme.base.widget.CoverImageView;
import com.github.ligbyte.theme.widget.ImageViewWidget;

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
