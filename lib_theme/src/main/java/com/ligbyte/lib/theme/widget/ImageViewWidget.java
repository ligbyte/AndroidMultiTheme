package com.ligbyte.lib.theme.widget;

import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;

import android.view.View;
import android.widget.ImageView;

import com.ligbyte.lib.theme.R;
import com.ligbyte.lib.theme.annotation.MultiThemeAttrs;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */
@MultiThemeAttrs({
        android.R.attr.src,
})
public class ImageViewWidget extends ViewWidget {

    @Override
    protected void initializeLibraryElements() {
        super.initializeLibraryElements();
        addThemeElementKey(R.attr.srcCompat);
    }

    @Override
    public void applyElementTheme(View view, @AttrRes int themeElementKey, @AnyRes int resId) {
        super.applyElementTheme(view, themeElementKey, resId);
        ImageView imageView = (ImageView) view;
        if (themeElementKey == android.R.attr.src) {
            setImageDrawable(imageView, resId);
        } else if (themeElementKey == R.attr.srcCompat) {
            setImageCompatDrawable(imageView, resId);
        }
    }

    public static void setImageDrawable(ImageView imageView, @DrawableRes int drawableResId) {
        if (imageView == null) {
            return;
        }

        imageView.setImageDrawable(getDrawable(imageView, drawableResId));
    }

    public static void setImageCompatDrawable(ImageView imageView, @DrawableRes int drawableResId) {
        if (imageView == null) {
            return;
        }

        imageView.setImageDrawable(getDrawable(imageView, drawableResId));
    }

}
