package listitems;

/**
 * Created by borde on 2017.06.13..
 */

public class Hotel {

    private String mName;

    private int mStarCount;

    private String mAddress;

    public Hotel(String mName, int mStarCount, String mAddress) {
        this.mName = mName;
        this.mStarCount = mStarCount;
        this.mAddress = mAddress;
    }

    public String getmName() {
        return mName;
    }

    public int getmStarCount() {
        return mStarCount;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getStarString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < mStarCount ; i++) {
            sb.append('*');
        }
        return sb.toString();
    }
}
