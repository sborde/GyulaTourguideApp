package hu.borde.gyulatourguide.activity;

import android.app.ActionBar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.adapter.RestaurantPagerAdapter;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        RestaurantPagerAdapter adapter = new RestaurantPagerAdapter(getSupportFragmentManager(), this);

        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(pager);


    }
}
