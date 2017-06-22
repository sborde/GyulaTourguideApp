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

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.model.MainCategory;

/**
 * Created by borde on 2017.06.13..
 */

public class MainCategoryAdapter extends ArrayAdapter<MainCategory> {

    public MainCategoryAdapter(@NonNull Context context, @NonNull MainCategory[] categories) {
        super(context, 0, categories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        }

        final MainCategory currentCategory = getItem(position);

        ImageView menuIcon = (ImageView) listItemView.findViewById(R.id.menu_icon);
        TextView menuLabel = (TextView) listItemView.findViewById(R.id.menu_label);

        menuIcon.setImageResource(currentCategory.getmIconResourceID());
        menuLabel.setText(currentCategory.getmTitle());

        return listItemView;
    }
}
