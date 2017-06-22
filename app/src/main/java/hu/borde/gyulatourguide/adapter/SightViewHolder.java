package hu.borde.gyulatourguide.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import hu.borde.gyulatourguide.R;

public class SightViewHolder {

    private TextView mNameView;

    private TextView mDescription;

    private ImageView mImageView;

    public SightViewHolder(@NonNull View containerView) {
        this.mNameView = (TextView) containerView.findViewById(R.id.item_title);
        this.mDescription = (TextView) containerView.findViewById(R.id.item_descript);
        this.mDescription.setMaxLines(Integer.MAX_VALUE);
        this.mImageView = (ImageView) containerView.findViewById(R.id.sight_picture);
        this.mImageView.setVisibility(View.VISIBLE);
        containerView.findViewById(R.id.item_image).setVisibility(View.GONE);
    }

    public void setName(String name) {
        this.mNameView.setText(name);
    }

    public void setDescription(String address) {
        this.mDescription.setText(address);
    }

    public void setImage(int imageResourceId) {
        this.mImageView.setImageResource(imageResourceId);
    }

}
