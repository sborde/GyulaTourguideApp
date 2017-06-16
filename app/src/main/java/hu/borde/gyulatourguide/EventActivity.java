package hu.borde.gyulatourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import listadapters.EventListAdapter;
import listitems.Event;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        List<Event> eventList = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            eventList.add(new Event("Sausage and Gammon muster of Gyula", sdf.parse("2017-03-31"), sdf.parse("2017-04-02")));
            eventList.add(new Event("International Agility Cup", sdf.parse("2017-04-15"), sdf.parse("2017-04-16")));
            eventList.add(new Event("Pálinka Festival of Gyula", sdf.parse("2017-04-10"), sdf.parse("2017-04-30")));
            eventList.add(new Event("Flowers Festival of Gyula", sdf.parse("2017-05-13"), sdf.parse("2017-05-14")));
            eventList.add(new Event("Gyulavári Mansion Days", sdf.parse("2017-05-19"), sdf.parse("2017-05-21")));
            eventList.add(new Event("Long Night of Museums", sdf.parse("2017-06-24")));
            eventList.add(new Event("Shakespeare Festival", sdf.parse("2017-07-07"), sdf.parse("2017-07-16")));
            eventList.add(new Event("Border Castle Days of Gyula", sdf.parse("2017-07-28"), sdf.parse("2017-07-30")));
            eventList.add(new Event("Festival of Wines", sdf.parse("2017-09-08"), sdf.parse("2017-09-10")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ListView listView = (ListView) findViewById(R.id.events_listview);

        EventListAdapter adapter = new EventListAdapter(this, eventList);

        listView.setAdapter(adapter);

    }
}
