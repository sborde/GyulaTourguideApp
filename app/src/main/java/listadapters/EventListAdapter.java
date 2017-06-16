package listadapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import hu.borde.gyulatourguide.R;
import listitems.Event;

/**
 * Created by borde on 2017.06.13..
 */

public class EventListAdapter extends ArrayAdapter<Event> {

    public EventListAdapter(@NonNull Context context, @NonNull List<Event> eventList) {
        super(context, 0, eventList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item, parent, false);
        }

        Event currentEvent = getItem(position);

        TextView eventTitle = (TextView) listItemView.findViewById(R.id.item_title);
        TextView eventDetail = (TextView) listItemView.findViewById(R.id.item_descript);

        eventTitle.setText(currentEvent.getmEventName());
        eventDetail.setText(currentEvent.getmEventDateAsString());

        listItemView.findViewById(R.id.item_image).setVisibility(View.GONE);
        listItemView.findViewById(R.id.on_map_icon).setVisibility(View.GONE);

        return listItemView;

    }
}
