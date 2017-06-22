package hu.borde.gyulatourguide.model;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class represents an event.
 */
public class Event {

    /**
     * Name of the event
     */
    private String mEventName;

    /**
     * Start date of the event.
     */
    private Date mEventStartDate;

    /**
     * End date of the event
     */
    private Date mEventEndDate;

    /**
     * Constructor for events which are organized only one day.
     * @param mEventName name of event
     * @param mEventStartDate day of the event
     */
    public Event(String mEventName, Date mEventStartDate) {
        this.mEventName = mEventName;
        this.mEventStartDate = mEventStartDate;
    }

    /**
     * Constructor for events which lasts more days long.
     * @param mEventName name of event
     * @param mEventStartDate start date
     * @param mEventEndDate end date
     */
    public Event(String mEventName, Date mEventStartDate, Date mEventEndDate) {
        this.mEventName = mEventName;
        this.mEventStartDate = mEventStartDate;
        this.mEventEndDate = mEventEndDate;
    }

    /**
     * Returns the name of the event.
     * @return name of the event
     */
    public String getmEventName() {
        return mEventName;
    }

    /**
     * Creates a string representation from the date of
     * the event.
     * @return the date or the interval as string
     */
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
