package com.example.arturmusayelyan.swipetabs;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
    private ViewPager pager;
    private ActionBar actionBar;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pager.setOnPageChangeListener(this);

        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab1 = actionBar.newTab();
        tab1.setText("Tab 1");
        tab1.setTabListener(this);

        ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setText("Tab 2");
        tab2.setTabListener(this);

        ActionBar.Tab tab3 = actionBar.newTab();
        tab3.setText("Tab 3");
        tab3.setTabListener(this);

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d("Art", "onTabSelected at position " + tab.getPosition() + " name+ " + tab.getText());
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d("Art", "onTabUnSelected at position " + tab.getPosition() + " name+ " + tab.getText());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d("Art", "onTabReSelected at position " + tab.getPosition() + " name+ " + tab.getText());
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Log.d("Art", "onPageScrolled at " + position);
    }

    @Override
    public void onPageSelected(int position) {
        Log.d("Art", "onPageSelected at " + position);
        actionBar.setSelectedNavigationItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if (state == ViewPager.SCROLL_STATE_IDLE) {
            Log.d("Art", "onPageScrollStateChanged IDLE");
        } else if (state == ViewPager.SCROLL_STATE_DRAGGING) {
            Log.d("Art", "onPageScrollStateChanged Dragging");
        } else if (state == ViewPager.SCROLL_STATE_SETTLING) {
            Log.d("Art", "onPageScrollStateChanged Settling");
        }


    }
}
