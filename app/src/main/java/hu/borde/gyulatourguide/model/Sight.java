package hu.borde.gyulatourguide.model;

/**
 * Class which represents a sight.
 */
public class Sight {

    /**
     * Name of the sight.
     */
    private String mSightName;

    /**
     * Long description of the sight.
     */
    private String mSightDescription;

    /**
     * Resource ID of the image represents
     * the current sight.
     */
    private int mSightImageResourceID;

    /**
     * Constructor for a sight. All parameters have to be given.
     * @param mSightName name of the sight
     * @param mSightDescription description for the sight
     * @param mSightImageResourceID resource ID of the image of the sight
     */
    public Sight(String mSightName, String mSightDescription, int mSightImageResourceID) {
        this.mSightName = mSightName;
        this.mSightDescription = mSightDescription;
        this.mSightImageResourceID = mSightImageResourceID;
    }

    /**
     * Returns the name of the sight
     * @return name of the sight
     */
    public String getmSightName() {
        return mSightName;
    }

    /**
     * Returns the description of the sight.
     * @return description of the sight.
     */
    public String getmSightDescription() {
        return mSightDescription;
    }

    /**
     * Returns the resource ID of the sight.
     * @return resource ID of the sight
     */
    public int getmSightImageResourceID() {
        return mSightImageResourceID;
    }
}
