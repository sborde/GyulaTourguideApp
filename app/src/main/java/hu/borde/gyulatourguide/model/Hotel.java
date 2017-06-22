package hu.borde.gyulatourguide.model;

/**
 * Class which represents a hotel.
 */
public class Hotel {

    /**
     * Name of the hotel.
     */
    private String mName;

    /**
     * Count of the start of the hotel.
     */
    private int mStarCount;

    /**
     * Address of the hotel. It will be displayed
     * and used for search on map.
     */
    private String mAddress;

    /**
     * Constructor for a hotel. All parameters have to be given.
     * @param mName name of the hotel
     * @param mStarCount number of stars
     * @param mAddress address of the hotel
     */
    public Hotel(String mName, int mStarCount, String mAddress) {
        this.mName = mName;
        this.mStarCount = mStarCount;
        this.mAddress = mAddress;
    }

    /**
     * Returns the name of the hotel.
     * @return name of the hotel
     */
    public String getmName() {
        return mName;
    }

    /**
     * Returns the address of the hotel.
     * @return address of the hotel
     */
    public String getmAddress() {
        return mAddress;
    }

    /**
     * Creates and returns a string representation from the number of stars.
     * @return number of stars as a string
     */
    public String getStarString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < mStarCount ; i++) {
            sb.append('*');
        }
        return sb.toString();
    }
}
