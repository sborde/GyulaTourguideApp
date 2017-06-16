package listitems;

/**
 * Created by borde on 2017.06.16..
 */

public class Sight {

    private String mSightName;

    private String mSightDescription;

    private int mSightImageResourceID;

    public Sight(String mSightName, String mSightDescription, int mSightImageResourceID) {
        this.mSightName = mSightName;
        this.mSightDescription = mSightDescription;
        this.mSightImageResourceID = mSightImageResourceID;
    }

    public String getmSightName() {
        return mSightName;
    }

    public String getmSightDescription() {
        return mSightDescription;
    }

    public int getmSightImageResourceID() {
        return mSightImageResourceID;
    }
}
