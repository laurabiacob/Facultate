package personal.ex.TicketingSystemClass;

public interface TicketingService {
    void sellTicket(Event event, Customer customer, TicketType ticketType);
    void reserveTicket(Event event, Customer customer, TicketType ticketType);
    boolean checkAvailability(Event event);
}
