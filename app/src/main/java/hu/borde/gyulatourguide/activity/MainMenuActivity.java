package hu.borde.gyulatourguide.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.adapter.MainCategoryAdapter;
import hu.borde.gyulatourguide.adapter.RestaurantListAdapter;
import hu.borde.gyulatourguide.model.MainCategory;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final MainCategory[] categories = new MainCategory[4];
        categories[0] = new MainCategory(getString(R.string.category_sights), R.drawable.ic_sights);
        categories[1] = new MainCategory(getString(R.string.category_restaurants), R.drawable.ic_dining);
        categories[2] = new MainCategory(getString(R.string.category_events), R.drawable.ic_festival);
        categories[3] = new MainCategory(getString(R.string.category_acc), R.drawable.ic_hotel);


        ListView categoryList = (ListView) findViewById(R.id.categories_listview);
        MainCategoryAdapter adapter = new MainCategoryAdapter(this, categories);

        categoryList.setAdapter(adapter);

        categoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0: startActivity(new Intent(MainMenuActivity.this, SightsActivity.class)); break;
                    case 1: startActivity(new Intent(MainMenuActivity.this, RestaurantActivity.class)); break;
                    case 2: startActivity(new Intent(MainMenuActivity.this, EventActivity.class)); break;
                    case 3: startActivity(new Intent(MainMenuActivity.this, AccomodationActivity.class)); break;
                }

            }
        });

    }
}
