package hu.borde.gyulatourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.model.Restaurant;

public class RestaurantListAdapter extends ArrayAdapter<Restaurant> {

    public RestaurantListAdapter(@NonNull Context context, @NonNull List<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item, parent, false);
        }

        Restaurant currentRestaurant = getItem(position);

        RestaurantViewHolder viewHolder = new RestaurantViewHolder(listItem);

        viewHolder.setName(currentRestaurant.getName());
        viewHolder.setAddress(currentRestaurant.getAddress());
        viewHolder.setImage(currentRestaurant.getType().getIconResourceId());

        return listItem;
    }
}
