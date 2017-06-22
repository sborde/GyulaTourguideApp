package hu.borde.gyulatourguide.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import hu.borde.gyulatourguide.fragment.AllRestaurantFragment;
import hu.borde.gyulatourguide.fragment.BarFragment;
import hu.borde.gyulatourguide.fragment.CafeFragment;
import hu.borde.gyulatourguide.fragment.FastFoodFragment;
import hu.borde.gyulatourguide.fragment.RestaurantFragment;
import hu.borde.gyulatourguide.model.Restaurant;

import hu.borde.gyulatourguide.R;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public RestaurantPagerAdapter(FragmentManager fm, Context c) {
        super(fm);
        this.mContext = c;
    }

    private int[] tabNames = {R.string.tab_all, R.string.tab_rest, R.string.tab_fast, R.string.tab_cafe, R.string.tab_bars};

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new AllRestaurantFragment();
            case 1: return new RestaurantFragment();
            case 2: return new FastFoodFragment();
            case 3: return new BarFragment();
            case 4: return new CafeFragment();
            default: return new AllRestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(tabNames[position]);
    }
}
