package com.paxw.path;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.paxw.path.utils.StatusBarUtil;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by lichuang on 2016/5/18.
 */
public class BaseActivity extends Activity {
    protected boolean openAd = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int b =  this.getSharedPreferences("onlinevar", Context.MODE_PRIVATE ).getInt("openAd",1);
        openAd = b == 2 ? true : false;
    }
    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
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
