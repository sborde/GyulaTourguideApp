package hu.borde.gyulatourguide.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import hu.borde.gyulatourguide.R;

public class RestaurantViewHolder {

    private TextView mNameView;

    private TextView mAddressView;

    private ImageView mCategoryImageView;

    public RestaurantViewHolder(@NonNull View containerView) {
        this.mNameView = (TextView) containerView.findViewById(R.id.item_title);
        this.mAddressView = (TextView) containerView.findViewById(R.id.item_descript);
        this.mCategoryImageView = (ImageView) containerView.findViewById(R.id.item_image);
    }

    public void setName(String name) {
        this.mNameView.setText(name);
    }

    public void setAddress(String address) {
        this.mAddressView.setText(address);
    }

    public void setImage(int imageResourceId) {
        this.mCategoryImageView.setImageResource(imageResourceId);
    }
}
