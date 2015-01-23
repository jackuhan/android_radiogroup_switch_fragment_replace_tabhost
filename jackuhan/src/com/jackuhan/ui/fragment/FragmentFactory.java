package com.jackuhan.ui.fragment;

import android.util.Log;

public class FragmentFactory {

	public static BaseFragment getFragmentByTag(String tag) {
        Log.d("FragmentFactory", "new " + tag);
		if (tag.equals(Home1Fra.FRAGMENT_TAG)) {
            return new Home1Fra();
		}
        else if (tag.equals(Home2Fra.FRAGMENT_TAG)) {
            return new Home2Fra();
        }
        else if (tag.equals(Home3Fra.FRAGMENT_TAG)) {
            return new Home3Fra();
        }
        else if (tag.equals(Home4Fra.FRAGMENT_TAG)) {
            return new Home4Fra();
        }
        else if (tag.equals(Home5Fra.FRAGMENT_TAG)) {
            return new Home5Fra();
        }
		else {
			return null;
		}
	}
}
