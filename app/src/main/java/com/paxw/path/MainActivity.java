package com.paxw.path;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.paxw.path.utils.AdUtils;

import net.youmi.android.AdManager;
import net.youmi.android.spot.SpotManager;

public class MainActivity extends BaseActivity {
    
	ImageButton guide, start;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//初始化
		AdManager.getInstance(this).init("178dff7a50e76c8d", "b788d558cbc7f6c6", false);
		// 设置是否在通知栏显示下载相关提示。默认为true，标识开启；设置为false则关闭。
		AdManager.setIsDownloadTipsDisplayOnNotification(false);
		AdManager.setIsInstallationSuccessTipsDisplayOnNotification(false);
		AdUtils.getOnlineVar(this);

		//预加载插屏
		SpotManager.getInstance(this).loadSpotAds();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		guide = (ImageButton)findViewById(R.id.guide);
		start = (ImageButton)findViewById(R.id.start);
		
		Animation alwaysTwinkleFastAnimation =AnimationUtils.loadAnimation(
                MainActivity.this, R.anim.always_twinkle_fast);
		start.startAnimation(alwaysTwinkleFastAnimation);
		
		guide.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), GuideActivity.class);
				startActivityForResult(intent1, 0);
			}
		});

		start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(v.getContext(), StartActivity.class);
				startActivityForResult(intent2,0);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
