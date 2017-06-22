package hu.borde.gyulatourguide.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.adapter.HotelListAdapter;
import hu.borde.gyulatourguide.model.Hotel;

public class AccomodationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);

        final List<Hotel> hotelList = new ArrayList<>();

        hotelList.add(new Hotel(getString(R.string.hotel_weln), 4, getString(R.string.hotel_weln_add)));
        hotelList.add(new Hotel(getString(R.string.hotel_eliz), 4, getString(R.string.hotel_eliz_add)));
        hotelList.add(new Hotel(getString(R.string.hotel_park), 3, getString(R.string.hotel_park_add)));
        hotelList.add(new Hotel(getString(R.string.hotel_erkel), 3, getString(R.string.hotel_erkel_add)));
        hotelList.add(new Hotel(getString(R.string.hotel_komlo), 4, getString(R.string.hotel_komlo_add)));
        hotelList.add(new Hotel(getString(R.string.hotel_corvin), 3, getString(R.string.hotel_corvin_add)));
        hotelList.add(new Hotel(getString(R.string.hotel_d), 3, getString(R.string.hotel_d_add)));

        ListView listView = (ListView) findViewById(R.id.hotels_listview);

        HotelListAdapter adapter = new HotelListAdapter(this, hotelList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Hotel selectedHotel = hotelList.get(position);

                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + selectedHotel.getmName() + " " + selectedHotel.getmAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}
