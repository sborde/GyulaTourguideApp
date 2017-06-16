package hu.borde.gyulatourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import listadapters.MainCategoryAdapter;
import listitems.MainCategory;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        MainCategory[] categories = new MainCategory[4];
        categories[0] = new MainCategory("Sights", R.drawable.ic_sights);
        categories[1] = new MainCategory("Restaurants", R.drawable.ic_dining);
        categories[2] = new MainCategory("Events, festivals", R.drawable.ic_festival);
        categories[3] = new MainCategory("Accomodations", R.drawable.ic_hotel);


        ListView categoryList = (ListView) findViewById(R.id.categories_listview);
        MainCategoryAdapter adapter = new MainCategoryAdapter(this, categories);

        categoryList.setAdapter(adapter);

        categoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MainCategory selectedCategory = (MainCategory) parent.getItemAtPosition(position);

                Log.i("MainActivity", "Position: " + position);
                switch (position) {
                    case 0: startActivity(new Intent(MainMenuActivity.this, SightsActivity.class)); break;
                    case 2: startActivity(new Intent(MainMenuActivity.this, EventActivity.class)); break;
                    case 3: startActivity(new Intent(MainMenuActivity.this, AccomodationActivity.class)); break;
                }

            }
        });

    }
}
