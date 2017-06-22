package hu.borde.gyulatourguide.activity;

import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.adapter.SightsListAdapter;
import hu.borde.gyulatourguide.model.Sight;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);


        final List<Sight> sightList = new ArrayList<>();

        sightList.add(new Sight(getString(R.string.sight_almasy), getString(R.string.sight_almasy_desc), R.drawable.almasy_castle));

        sightList.add(new Sight(getString(R.string.sight_castle), getString(R.string.sight_castle_desc), R.drawable.gyula_castle));

        sightList.add(new Sight(getString(R.string.sight_centennial), getString(R.string.sight_centennial_desc), R.drawable.gyula_centennial));

        sightList.add(new Sight(getString(R.string.sight_snail), getString(R.string.sight_snail_desc), R.drawable.snail_garden));

        sightList.add(new Sight(getString(R.string.sight_marychurc), getString(R.string.sight_marychurc_desc), R.drawable.mary_church));

        sightList.add(new Sight(getString(R.string.sight_ladics), getString(R.string.sight_ladics_desc), R.drawable.ladics));

        sightList.add(new Sight(getString(R.string.sight_erkel), getString(R.string.sight_erkel_desc), R.drawable.erkel_house));

        sightList.add(new Sight(getString(R.string.sight_ceremony), getString(R.string.sight_ceremony_desc), R.drawable.ceremony_hall));

        sightList.add(new Sight(getString(R.string.sight_bath), getString(R.string.sight_bath_desc), R.drawable.bath));

        sightList.add(new Sight(getString(R.string.sight_gyulavari), getString(R.string.sight_gyulavari_desc), R.drawable.gyulavari));

        ListView listView = (ListView) findViewById(R.id.sights_listview);

        SightsListAdapter adapter = new SightsListAdapter(this, sightList);

        listView.setAdapter(adapter);

        listView.setDivider(new ColorDrawable(ContextCompat.getColor(this, R.color.colorPrimaryDark)));
        listView.setDividerHeight(5);


    }
}
