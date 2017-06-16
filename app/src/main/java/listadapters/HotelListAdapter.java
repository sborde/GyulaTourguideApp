package listadapters;

import android.content.Context;
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
import listitems.Hotel;

/**
 * Created by borde on 2017.06.13..
 */

public class HotelListAdapter extends ArrayAdapter<Hotel> {

    public HotelListAdapter(@NonNull Context context, @NonNull List<Hotel> hotelList) {
        super(context, 0, hotelList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item, parent, false);
        }

        Hotel currentHotel = getItem(position);

        TextView eventTitle = (TextView) listItemView.findViewById(R.id.item_title);
        TextView eventDetail = (TextView) listItemView.findViewById(R.id.item_descript);

        eventTitle.setText(currentHotel.getmName() + " " + currentHotel.getStarString());
        eventDetail.setText(currentHotel.getmAddress());

        listItemView.findViewById(R.id.item_image).setVisibility(View.GONE);

        return listItemView;

    }
}
