package com.example.jason.helloworld.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.jason.helloworld.activities.MainActivity;

/**
 * Created by Jay on 2015/8/31 0031.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private LatestTvShowsFragment latestTvShowsFragment = null;
    private MyFragment2 myFragment2 = null;
    private MyFragment3 myFragment3 = null;
    private PersonnalFragment personnalFragment = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        latestTvShowsFragment = new LatestTvShowsFragment();
        myFragment2 = new MyFragment2();
        myFragment3 = new MyFragment3();
        personnalFragment = new PersonnalFragment();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case MainActivity.PAGE_ONE:
                fragment = latestTvShowsFragment;
                break;
            case MainActivity.PAGE_TWO:
                fragment = myFragment2;
                break;
            case MainActivity.PAGE_THREE:
                fragment = myFragment3;
                break;
            case MainActivity.PAGE_FOUR:
                fragment = personnalFragment;
                break;
        }
        return fragment;
    }


}

