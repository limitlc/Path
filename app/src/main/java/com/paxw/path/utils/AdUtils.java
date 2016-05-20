package com.paxw.path.utils;

import android.app.Activity;
import android.view.Gravity;
import android.widget.FrameLayout;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

/**
 * Created by lichuang on 2016/5/18.
 */
public class AdUtils {
    public static void setAD(Activity context){
        // 实例化 LayoutParams（重要）
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.FILL_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

        // 设置广告条的悬浮位置
        layoutParams.gravity = Gravity.BOTTOM | Gravity.RIGHT; // 这里示例为右下角

        // 实例化广告条
        AdView adView = new AdView(context, AdSize.FIT_SCREEN);

        // 调用 Activity 的 addContentView 函数
        context.addContentView(adView, layoutParams);
    }
}
