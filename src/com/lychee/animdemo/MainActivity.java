package com.lychee.animdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @File MainActivity.java
 * @Package com.lychee.animdemo
 * @Description TODO
 * @Copyright Copyright © 2015
 * @Site https://github.com/Cryhelyxx
 * @Blog http://blog.csdn.net/Cryhelyxx
 * @Email zxx@lychee-info.cn
 * @Company lychee
 * @Date 2015年10月8日 上午9:26:04
 * @author zhuxiongxian
 * @version 1.0
 */
public class MainActivity extends Activity implements OnClickListener {
	
	private Button btnJavaAnim;
	private Button btnXmlAnim;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
		initData();
	}

	/**
	 * 
	 */
	private void initView() {
		btnJavaAnim = (Button) this.findViewById(R.id.btnJavaAnim);
		btnXmlAnim = (Button) this.findViewById(R.id.btnXmlAnim);
		
		btnJavaAnim.setOnClickListener(this);
		btnXmlAnim.setOnClickListener(this);
	}

	/**
	 * 
	 */
	private void initData() {
		
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		Intent intent = null;
		switch (id) {
		case R.id.btnJavaAnim:
			intent = new Intent(MainActivity.this, AnimationActivity.class);
			startActivity(intent);
			break;
		case R.id.btnXmlAnim:
			intent = new Intent(MainActivity.this, AnimationActivity02.class);
			startActivity(intent);
			break;

		default:
			break;
		}
	}
	
	

}
