import org.example.Ticket;
import org.example.TicketRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketRepositoryTest {

    @Test
    public void testRepositoryFindAll() {

        TicketRepository repo = new TicketRepository();

        Ticket ticket1 = new Ticket(1, 1000, "SPB", "MSK", 60);
        Ticket ticket2 = new Ticket(2, 1500, "SPB", "MSK", 70);
        Ticket ticket3 = new Ticket(3, 1200, "MSK", "MSQ", 65);
        Ticket ticket4 = new Ticket(4, 1100, "MSQ", "SPB", 50);
        Ticket ticket5 = new Ticket(5, 1300, "SPB", "MSK", 75);
        Ticket ticket6 = new Ticket(6, 1050, "MSK", "MSQ", 75);
        Ticket ticket7 = new Ticket(7, 900, "MSK", "MSQ", 80);

        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.save(ticket4);
        repo.save(ticket5);
        repo.save(ticket6);
        repo.save(ticket7);

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRepositoryDeleteById() {

        TicketRepository repo = new TicketRepository();

        Ticket ticket1 = new Ticket(1, 1000, "SPB", "MSK", 60);
        Ticket ticket2 = new Ticket(2, 1500, "SPB", "MSK", 70);
        Ticket ticket3 = new Ticket(3, 1200, "MSK", "MSQ", 65);
        Ticket ticket4 = new Ticket(4, 1100, "MSQ", "SPB", 50);
        Ticket ticket5 = new Ticket(5, 1300, "SPB", "MSK", 75);
        Ticket ticket6 = new Ticket(6, 1050, "MSK", "MSQ", 75);
        Ticket ticket7 = new Ticket(7, 900, "MSK", "MSQ", 80);

        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.save(ticket4);
        repo.save(ticket5);
        repo.save(ticket6);
        repo.save(ticket7);
        repo.deleteById(3);

        Ticket[] expected = {ticket1, ticket2, ticket4, ticket5, ticket6, ticket7};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
