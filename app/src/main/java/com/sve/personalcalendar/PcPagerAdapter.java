package com.sve.personalcalendar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Sve on 21.02.2015.
 */
public class PcPagerAdapter extends FragmentPagerAdapter {

    private static String TAG = "PcPagerAdapter";

    private ArrayList<Fragment> mFragments;

    public static final int CALENDAR = 0;
    public static final int HISTORY = 1;
    public static final String UI_TAB_CALENDAR = "Calendar";
    public static final String UI_TAB_HISTORY = "History";

    public PcPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments){
        super(fm);
        this.mFragments = fragments;
    }

    public Fragment getItem(int pos){
        Log.d(TAG, "getItem() pos=" + pos);
        return mFragments.get(pos);
    }

    public int getCount(){
//        Log.d(TAG, "getCount()");
        return mFragments.size();
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case CALENDAR:
                return UI_TAB_CALENDAR;
            case HISTORY:
                return UI_TAB_HISTORY;
            default:
                break;
        }
        return null;
    }
}
