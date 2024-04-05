package personal.ex.TicketingSystemClass;

public class Ticket {
    private String ticketCode;
    private TicketType ticketType;
    private double price;
    private TicketStatus status;

    public Ticket(String ticketCode, TicketType ticketType, double price, TicketStatus status) {
        this.ticketCode = ticketCode;
        this.ticketType = ticketType;
        this.price = price;
        this.status = status;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public double getPrice() {
        return price;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }
}
