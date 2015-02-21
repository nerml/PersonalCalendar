package com.sve.personalcalendar;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.sve.personalcalendar.slidingtabs.SlidingTabLayout;

import java.util.ArrayList;


public class PcActivity extends ActionBarActivity {

    private static String TAG = "PcActivity";

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> mFragments;
    private PcPagerAdapter mViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc);

        // Define SlidingTabLayout (shown at top)
        // and ViewPager (shown at bottom) in the layout.
        // Get their instances.
        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.tab);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        // create a fragment list in order.
        mFragments = new ArrayList<Fragment>();
        mFragments.add(new CalendarFragment());
        mFragments.add(new HistoryFragment());

        // use FragmentPagerAdapter to bind the slidingTabLayout (tabs with different titles) and ViewPager (different pages of fragment) together.
        mViewPagerAdapter = new PcPagerAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(mViewPagerAdapter);
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setViewPager(mViewPager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        Log.d(TAG, "onCreateOptionsMenu()");

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pc, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Log.d(TAG, "onOptionsItemSelected()");

        switch (item.getItemId()) {
            case R.id.menuitem_search:
                Toast.makeText(this, getString(R.string.ui_menu_search),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem_send:
                Toast.makeText(this, getString(R.string.ui_menu_send),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem_add:
                Toast.makeText(this, getString(R.string.ui_menu_add),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem_share:
                Toast.makeText(this, getString(R.string.ui_menu_share),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem_feedback:
                Toast.makeText(this, getString(R.string.ui_menu_feedback),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem_about:
                Toast.makeText(this, getString(R.string.ui_menu_about),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem_quit:
                Toast.makeText(this, getString(R.string.ui_menu_quit),
                        Toast.LENGTH_SHORT).show();
                finish(); // close the activity
                return true;
        }
        return false;
    }


    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPressed()");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyDown()");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyUp()");
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyShortcut()");
        return true;
    }


}
