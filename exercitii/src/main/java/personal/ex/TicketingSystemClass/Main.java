package personal.ex.TicketingSystemClass;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Event event = new Event("Concert", new Date(), "Stadion", 1000);

        Customer customer = new Customer("John Doe", "john@example.com", "123456789");

        TicketingService ticketingService = (TicketingService) new TicketingServiceImpl();

        ticketingService.sellTicket(event, customer, TicketType.REGULAR);

        boolean isAvailable = ticketingService.checkAvailability(event);
        if (isAvailable) {
            System.out.println("Evenimentul mai are locuri disponibile.");
        } else {
            System.out.println("Evenimentul este complet vândut.");
        }
    }
}
