import org.example.Ticket;
import org.example.TicketManager;
import org.example.TicketRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {

    @Test
    public void testSortTicket() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 1000, "SPB", "MSK", 60);
        Ticket ticket2 = new Ticket(2, 1500, "SPB", "MSK", 70);
        Ticket ticket3 = new Ticket(3, 1200, "MSK", "MSQ", 65);
        Ticket ticket4 = new Ticket(4, 1100, "MSQ", "SPB", 50);
        Ticket ticket5 = new Ticket(5, 1300, "SPB", "MSK", 75);
        Ticket ticket6 = new Ticket(6, 1050, "MSK", "MSQ", 75);
        Ticket ticket7 = new Ticket(7, 900, "MSK", "MSQ", 80);

        manager.save(ticket1);
        manager.save(ticket2);
        manager.save(ticket3);
        manager.save(ticket4);
        manager.save(ticket5);
        manager.save(ticket6);
        manager.save(ticket7);


        Ticket[] expected = {ticket1, ticket5, ticket2};
        Ticket[] actual = manager.findAll("SPB", "MSK");

        Assertions.assertArrayEquals(expected, actual);
    }
}
