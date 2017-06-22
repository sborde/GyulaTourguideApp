package hu.borde.gyulatourguide.model;

import android.support.annotation.NonNull;

import hu.borde.gyulatourguide.R;

/**
 * Class represents a restaurant. It implements the comparable
 * interface to support sorting.
 */
public class Restaurant implements Comparable<Restaurant> {

    /**
     * Name of the restaurant.
     */
    private String mName;

    /**
     * Address of the restaurant. It will be
     * displayed in the list and used for open in map.
     */
    private String mAddress;

    /**
     * Type of the restaurant.
     */
    private RestaurantType mType;

    @Override
    public int compareTo(@NonNull Restaurant o) {
        return this.mName.compareTo(o.getName());
    }

    /**
     * Enum which represents the type of the restaurant. Each
     * type contains its representative icon's resource ID.
     */
    public enum RestaurantType {

        RESTAURANT(R.drawable.ic_restaurant),
        FASTFOOD(R.drawable.ic_fastfood),
        CAFE(R.drawable.ic_cafe),
        BAR(R.drawable.ic_bar);

        private int mIconResourceId;

        RestaurantType(int mIconResourceId) {
            this.mIconResourceId = mIconResourceId;
        }

        public int getIconResourceId() {
            return this.mIconResourceId;
        }

    }

    /**
     * Constructor for the restaurant. All parameters needed.
     * @param name name of the restaurant
     * @param address address of the restaurant
     * @param type type of the restaurant
     */
    public Restaurant(String name, String address, RestaurantType type) {
        this.mName = name;
        this.mAddress = address;
        this.mType = type;
    }

    /**
     * Returns the name of the restaurant.
     * @return the name of the restaurant
     */
    public String getName() {
        return mName;
    }

    /**
     * Returns the address of the restaurant.
     * @return the address of the restaurant
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Returns the type of the restaurant.
     * @return the type of the restaurant
     */
    public RestaurantType getType() {
        return mType;
    }



}
