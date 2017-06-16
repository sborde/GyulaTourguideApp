package listitems;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by borde on 2017.06.13..
 */

public class Event {

    private String mEventName;

    private Date mEventStartDate;

    private Date mEventEndDate;

    public Event(String mEventName, Date mEventStartDate) {
        this.mEventName = mEventName;
        this.mEventStartDate = mEventStartDate;
    }

    public Event(String mEventName, Date mEventStartDate, Date mEventEndDate) {
        this.mEventName = mEventName;
        this.mEventStartDate = mEventStartDate;
        this.mEventEndDate = mEventEndDate;
    }

    public String getmEventName() {
        return mEventName;
    }

    public Date getmEventStartDate() {
        return mEventStartDate;
    }

    public Date getmEventEndDate() {
        return mEventEndDate;
    }

    public String getmEventDateAsString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        StringBuilder sb = new StringBuilder();
        sb.append(sdf.format(mEventStartDate));
        if (mEventEndDate != null) {
            sb.append(" - ").append(sdf.format(mEventEndDate));
        }
        return sb.toString();
    }
}
