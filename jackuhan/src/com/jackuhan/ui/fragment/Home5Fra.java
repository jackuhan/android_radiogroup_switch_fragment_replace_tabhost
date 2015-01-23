package com.jackuhan.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.jackuhan.R;
import com.jackuhan.ui.fragment.BaseFragment;


/**
 * 空白页面
 */
public class Home5Fra extends BaseFragment implements OnClickListener {

    public static String FRAGMENT_TAG = Home5Fra.class.getSimpleName();

    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.index_5, null);

		return v;
	}

	@Override
	public void onClick(View v) {
	}

}
