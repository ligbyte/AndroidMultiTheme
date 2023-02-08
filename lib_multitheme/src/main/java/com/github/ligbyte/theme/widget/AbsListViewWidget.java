package com.github.ligbyte.theme.widget;

import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import android.view.View;
import android.widget.AbsListView;

import com.github.ligbyte.theme.annotation.MultiThemeAttrs;
/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */
@MultiThemeAttrs({
        android.R.attr.listSelector
})
public class AbsListViewWidget extends ViewWidget {

    @Override
    public void applyElementTheme(View view, @AttrRes int themeElementKey, @AnyRes int resId) {
        super.applyElementTheme(view, themeElementKey, resId);
        AbsListView absListView = (AbsListView) view;
        switch (themeElementKey) {
            case android.R.attr.listSelector:
                setSelector(absListView, resId);
                break;
        }
    }

    public static void setSelector(AbsListView absListView, @DrawableRes int drawableResId) {
        if (absListView == null) {
            return;
        }

        absListView.setSelector(getDrawable(absListView, drawableResId));
    }

}
