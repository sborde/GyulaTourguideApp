package listitems;

import android.app.Activity;

/**
 * Created by borde on 2017.06.13..
 */

public class MainCategory {

    private Activity mTargetActivity;

    private String mTitle;

    private int mIconResourceID;

    public MainCategory(String mTitle, int mIconResourceID) {
        this.mTitle = mTitle;
        this.mIconResourceID = mIconResourceID;
    }

    public MainCategory(String mTitle, int mIconResourceID, Activity mTargetActivity) {
        this(mTitle, mIconResourceID);
        this.mTargetActivity = mTargetActivity;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmIconResourceID() {
        return mIconResourceID;
    }

    public Activity getmTargetActivity() {
        return mTargetActivity;
    }
}
