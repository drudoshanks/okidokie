package org.cocos2dx.cpp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hstvtandroidapps.okidokie.R;
import com.squareup.picasso.Picasso;

public class GallryImage extends Fragment {

	int url = 0;
	int backimageUrl =0;

	public static GallryImage newInstance(int url,int backimageUrl ) {
		GallryImage f = new GallryImage();
		Bundle b = new Bundle();
		b.putInt("url", url);
		b.putInt("backimageUrl", backimageUrl);
		f.setArguments(b);
		return f;
	}

	View view;
	ImageView gallary_image_id,back_image_id;
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.image_gallary, container, false);

		Bundle bundle = this.getArguments();
		url = bundle.getInt("url");
		backimageUrl = bundle.getInt("backimageUrl");

		
		// set images here
		gallary_image_id = (ImageView) view.findViewById(R.id.gallary_image_id);

		try {

			Picasso.with(getActivity()).load(url).fit().into(gallary_image_id);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// set back images here
		back_image_id = (ImageView)view.findViewById(R.id.back_image_id);

		try {

			Picasso.with(getActivity()).load(backimageUrl).fit().into(back_image_id);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return view;
	}

}
