package hu.borde.gyulatourguide.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.adapter.EventListAdapter;
import hu.borde.gyulatourguide.model.Event;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        List<Event> eventList = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            eventList.add(new Event(getString(R.string.event_sausage), sdf.parse("2017-03-31"), sdf.parse("2017-04-02")));
            eventList.add(new Event(getString(R.string.event_agility), sdf.parse("2017-04-15"), sdf.parse("2017-04-16")));
            eventList.add(new Event(getString(R.string.event_palinka), sdf.parse("2017-04-10"), sdf.parse("2017-04-30")));
            eventList.add(new Event(getString(R.string.event_flowers), sdf.parse("2017-05-13"), sdf.parse("2017-05-14")));
            eventList.add(new Event(getString(R.string.event_gyulavari), sdf.parse("2017-05-19"), sdf.parse("2017-05-21")));
            eventList.add(new Event(getString(R.string.event_museum), sdf.parse("2017-06-24")));
            eventList.add(new Event(getString(R.string.event_shak), sdf.parse("2017-07-07"), sdf.parse("2017-07-16")));
            eventList.add(new Event(getString(R.string.event_bordercast), sdf.parse("2017-07-28"), sdf.parse("2017-07-30")));
            eventList.add(new Event(getString(R.string.event_wine), sdf.parse("2017-09-08"), sdf.parse("2017-09-10")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ListView listView = (ListView) findViewById(R.id.events_listview);

        EventListAdapter adapter = new EventListAdapter(this, eventList);

        listView.setAdapter(adapter);

    }
}
