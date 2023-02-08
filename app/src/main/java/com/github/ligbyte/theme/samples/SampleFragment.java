package com.github.ligbyte.theme.samples;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.ligbyte.theme.base.BaseThemeFragment;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */

public class SampleFragment extends BaseThemeFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_sample, container, false);
    }
}
