package hu.borde.gyulatourguide.model;

import android.app.Activity;

/**
 * Class which represents a main category in the app. It is used for the list view.
 */
public class MainCategory {

    /**
     * Title of category. It will be
     * displayed in the menu.
     */
    private String mTitle;

    /**
     * Resource id for the icon image.
     */
    private int mIconResourceID;

    /**
     * Constructor for menu item. All parameter have to be given.
     * @param mTitle label of menu
     * @param mIconResourceID icon resource id for image
     */
    public MainCategory(String mTitle, int mIconResourceID) {
        this.mTitle = mTitle;
        this.mIconResourceID = mIconResourceID;
    }

    /**
     * Returns the label of the menu
     * @return label of the menu
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * Returns the resource ID of the icon image
     * @return resource ID of the icon image
     */
    public int getmIconResourceID() {
        return mIconResourceID;
    }

}
