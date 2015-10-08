package com.lychee.animdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity02 extends Activity implements OnClickListener {

	private Button btnAlpha;
	private Button btnScale;
	private Button btnRotate;
	private Button btnTranslate;
	private ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_anim);
		
		setTitle("xml实现");

		initView();
		initData();
	}

	/**
	 * 
	 */
	private void initView() {
		btnAlpha = (Button) this.findViewById(R.id.btnAlpha);
		btnScale = (Button) this.findViewById(R.id.btnScale);
		btnRotate = (Button) this.findViewById(R.id.btnRotate);
		btnTranslate = (Button) this.findViewById(R.id.btnTranslate);
		image = (ImageView) this.findViewById(R.id.image);

		btnAlpha.setOnClickListener(this);
		btnScale.setOnClickListener(this);
		btnRotate.setOnClickListener(this);
		btnTranslate.setOnClickListener(this);
	}

	/**
	 * 
	 */
	private void initData() {

	}

	@Override
	public void onClick(View v) {
		int i = v.getId();
		Animation animation = null;
		switch (i) {
		case R.id.btnAlpha:
			// 使用AnimationUtils装载动画配置文件
			animation = AnimationUtils.loadAnimation(
					AnimationActivity02.this, R.anim.alpha);
			// 启动动画
			image.startAnimation(animation);
			break;
		case R.id.btnScale:
			// 使用AnimationUtils装载动画配置文件
			animation = AnimationUtils.loadAnimation(
					AnimationActivity02.this, R.anim.scale);
			// 启动动画
			image.startAnimation(animation);
			break;
		case R.id.btnRotate:
			animation = AnimationUtils.loadAnimation(
					AnimationActivity02.this, R.anim.rotate);
			image.startAnimation(animation);
			break;
		case R.id.btnTranslate:
			// 使用AnimationUtils装载动画配置文件
			animation = AnimationUtils.loadAnimation(
					AnimationActivity02.this, R.anim.translate);
			// 启动动画
			image.startAnimation(animation);
			break;

		default:
			break;
		}
	}

}
