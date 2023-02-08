package com.github.ligbyte.theme.annotation;

import androidx.annotation.AttrRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: jeek
 * @Date: 2023/2/8
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface MultiThemeAttrs {
    @AttrRes int[] value();
}
