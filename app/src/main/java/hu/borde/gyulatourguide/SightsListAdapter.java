package hu.borde.gyulatourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import listadapters.HotelListAdapter;
import listitems.Sight;

/**
 * Created by borde on 2017.06.16..
 */

class SightsListAdapter extends ArrayAdapter<Sight> {

    public SightsListAdapter(@NonNull Context context, @NonNull List<Sight> sights) {
        super(context, 0, sights);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item, parent, false);
        }

        Sight currentSight = getItem(position);

        ((TextView)listItem.findViewById(R.id.item_title)).setText(currentSight.getmSightName());

        TextView descriptionTextView = (TextView)listItem.findViewById(R.id.item_descript);
        ImageView sightImage = (ImageView)listItem.findViewById(R.id.item_image);

        descriptionTextView.setText(currentSight.getmSightDescription());
        descriptionTextView.setMaxLines(Integer.MAX_VALUE);

        sightImage.setImageResource(currentSight.getmSightImageResourceID());

        listItem.findViewById(R.id.on_map_icon).setVisibility(View.GONE);

        return listItem;
    }
}
