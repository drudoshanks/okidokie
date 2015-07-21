package org.cocos2dx.cpp;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.hstvtandroidapps.okidokie.R;
import com.model.Gallarymodel;

public class Tutorial extends FragmentActivity {

	private ViewPager _pager;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);

		setContentView(R.layout.tutorial);

		_pager = (ViewPager) findViewById(R.id._pager);

		final ArrayList<Gallarymodel> mainmodle = new ArrayList<Gallarymodel>();

		Gallarymodel model = new Gallarymodel();
		model.setImageId(0);
		model.setImageUrl(R.drawable.one);
		model.setBackImageUrl(R.drawable.game_background1);
		mainmodle.add(model);

		Gallarymodel model1 = new Gallarymodel();
		model1.setImageId(1);
		model1.setImageUrl(R.drawable.two);
		model1.setBackImageUrl(R.drawable.game_background2);
		mainmodle.add(model1);

		Gallarymodel model2 = new Gallarymodel();
		model2.setImageId(2);
		model2.setImageUrl(R.drawable.three);
		model2.setBackImageUrl(R.drawable.game_background3);
		mainmodle.add(model2);

		Gallarymodel model3 = new Gallarymodel();
		model3.setImageId(3);
		model3.setImageUrl(R.drawable.four);
		model3.setBackImageUrl(R.drawable.game_background4);
		mainmodle.add(model3);

		MyPagerAdapter adapter = new MyPagerAdapter(
				getSupportFragmentManager(), mainmodle);

		_pager.setAdapter(adapter);

		Button skip = (Button) findViewById(R.id.skip);
		skip.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Tutorial.this, AppActivity.class));
				finish();
			}
		});
	}

	private class MyPagerAdapter extends FragmentPagerAdapter {

		ArrayList<Gallarymodel> main_model;

		public MyPagerAdapter(FragmentManager fm,
				ArrayList<Gallarymodel> main_model) {
			super(fm);

			this.main_model = main_model;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			// return main_model.get(position).getText();
			return "";
		}

		@Override
		public int getCount() {
			return main_model.size();
		}

		@Override
		public Fragment getItem(int position) {
			return GallryImage.newInstance(main_model.get(position)
					.getImageUrl(), main_model.get(position).getBackImageUrl());
		}

	}
}
