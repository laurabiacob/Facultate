package personal.ex.TicketingSystemClass;

import java.util.Date;

public class Event {
    private String eventName;
    private Date dateAndTime;
    private String location;
    private int availableSeats;

    public Event(String eventName, Date dateAndTime, String location, int availableSeats) {
        this.eventName = eventName;
        this.dateAndTime = dateAndTime;
        this.location = location;
        this.availableSeats = availableSeats;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public String getLocation() {
        return location;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void updateAvailableSeats(int seats) {
        availableSeats += seats;
    }
}
