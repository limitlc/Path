package com.paxw.path;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;

import com.paxw.path.utils.AdUtils;
import com.paxw.path.utils.StatusBarUtil;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

/**
 * Created by lichuang on 2016/5/18.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }

    protected void setStatusBar() {
        StatusBarUtil.setTranslucent(this,100);
    }
}
