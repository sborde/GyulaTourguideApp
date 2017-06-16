package hu.borde.gyulatourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import listadapters.EventListAdapter;
import listadapters.HotelListAdapter;
import listitems.Event;
import listitems.Hotel;

public class AccomodationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);

        final List<Hotel> hotelList = new ArrayList<>();

        hotelList.add(new Hotel("Wellness Hotel Gyula", 4, "5700, Gyula, Part str. 5."));
        hotelList.add(new Hotel("Elizabeth Hotel", 4, "5700, Gyula, Vár str. 1."));
        hotelList.add(new Hotel("Park Hotel Gyula", 3, "5700, Gyula, Part str. 15."));
        hotelList.add(new Hotel("Hunguest Hotel Erkel", 3, "5700, Gyula, Várkert str. 1"));
        hotelList.add(new Hotel("Komló Hotel", 4, "5700, Gyula, Béke blvd. 8."));
        hotelList.add(new Hotel("Corvin Hotel Gyula", 3, "5700, Gyula, Jókai str. 9-11."));
        hotelList.add(new Hotel("D-Hotel", 3, "5700, Gyula, Dózsa Gy. str. 4-6."));

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
