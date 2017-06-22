package hu.borde.gyulatourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.model.Sight;

/**
 * Created by borde on 2017.06.16..
 */

public class SightsListAdapter extends ArrayAdapter<Sight> {

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
        SightViewHolder holder = new SightViewHolder(listItem);

        holder.setName(currentSight.getmSightName());
        holder.setDescription(currentSight.getmSightDescription());
        holder.setImage(currentSight.getmSightImageResourceID());

        listItem.findViewById(R.id.on_map_icon).setVisibility(View.GONE);

        return listItem;
    }
}
