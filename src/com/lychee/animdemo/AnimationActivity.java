package com.lychee.animdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends Activity implements OnClickListener {

	private Button btnAlpha;
	private Button btnScale;
	private Button btnRotate;
	private Button btnTranslate;
	private ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_anim);
		
		setTitle("java实现");

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
		AnimationSet animationSet = null;
		switch (i) {
		case R.id.btnAlpha:
			// 创建一个AnimationSet对象，参数为Boolean型，
			// true表示使用Animation的interpolator，false则是使用自己的
			animationSet = new AnimationSet(true);
			// 创建一个AlphaAnimation对象，参数从完全的透明度，到完全的不透明
			AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
			// 设置动画执行的时间为500ms
			alphaAnimation.setDuration(500);
			// 将alphaAnimation对象添加到AnimationSet当中
			animationSet.addAnimation(alphaAnimation);
			// 使用ImageView的startAnimation方法执行动画
			image.startAnimation(animationSet);
			break;
		case R.id.btnScale:
			animationSet = new AnimationSet(true);
			// 参数1：x轴的初始值
			// 参数2：x轴收缩后的值
			// 参数3：y轴的初始值
			// 参数4：y轴收缩后的值
			// 参数5：确定x轴坐标的类型
			// 参数6：x轴的值，0.5f表明是以自身这个控件的一半长度为x轴
			// 参数7：确定y轴坐标的类型
			// 参数8：y轴的值，0.5f表明是以自身这个控件的一半长度为x轴
			ScaleAnimation scaleAnimation = new ScaleAnimation(
					0, 0.1f,0,0.1f,
					Animation.RELATIVE_TO_SELF,0.5f,
					Animation.RELATIVE_TO_SELF,0.5f);
			scaleAnimation.setDuration(1000);
			animationSet.addAnimation(scaleAnimation);
			image.startAnimation(animationSet);
			break;
		case R.id.btnRotate:
			animationSet = new AnimationSet(true);
			// 参数1：从哪个旋转角度开始
			// 参数2：转到什么角度
			// 后4个参数用于设置围绕着旋转的圆的圆心在哪里
			// 参数3：确定x轴坐标的类型，有ABSOLUT绝对坐标、RELATIVE_TO_SELF相对于自身坐标、RELATIVE_TO_PARENT相对于父控件的坐标
			// 参数4：x轴的值，0.5f表明是以自身这个控件的一半长度为x轴
			// 参数5：确定y轴坐标的类型
			// 参数6：y轴的值，0.5f表明是以自身这个控件的一半长度为x轴
			RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
					Animation.RELATIVE_TO_SELF,0.5f,
					Animation.RELATIVE_TO_SELF,0.5f);
			rotateAnimation.setDuration(1000);
			animationSet.addAnimation(rotateAnimation);
			image.startAnimation(animationSet);
			break;
		case R.id.btnTranslate:
			animationSet = new AnimationSet(true);
			// 参数1～2：x轴的开始位置
			// 参数3～4：y轴的开始位置
			// 参数5～6：x轴的结束位置
			// 参数7～8：x轴的结束位置
			TranslateAnimation translateAnimation =
					new TranslateAnimation(
							Animation.RELATIVE_TO_SELF,0f,
							Animation.RELATIVE_TO_SELF,0.5f,
							Animation.RELATIVE_TO_SELF,0f,
							Animation.RELATIVE_TO_SELF,0.5f);
			translateAnimation.setDuration(1000);
			animationSet.addAnimation(translateAnimation);
			image.startAnimation(animationSet);
			break;

		default:
			break;
		}
	}

}
