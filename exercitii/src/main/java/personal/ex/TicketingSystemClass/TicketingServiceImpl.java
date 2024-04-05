package personal.ex.TicketingSystemClass;

public class TicketingServiceImpl {
    public void sellTicket(Event event, Customer customer, TicketType ticketType) {
        System.out.println("Bilet vândut pentru evenimentul: " + event.getEventName() + ", Tip bilet: " + ticketType);
    }

    public void reserveTicket(Event event, Customer customer, TicketType ticketType) {
        System.out.println("Bilet rezervat pentru evenimentul: " + event.getEventName() + ", Tip bilet: " + ticketType);
    }

    public boolean checkAvailability(Event event) {
        return event.getAvailableSeats() > 0;
    }
}
