package org.example;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];


    public Ticket[] findAll() {

        return tickets;
    }

    public void save(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public void deleteById(int deleteId) {

        Ticket[] tmp = new Ticket[tickets.length - 1];

        int index = 0;

        for (Ticket ticket : tickets) {
            if (ticket.getId() == deleteId) {
                continue;
            } else {
                tmp[index] = ticket;
                index++;
            }
        }
        tickets = tmp;
    }

    public Ticket findByAirportEnt(String air) {
        for (Ticket ticket : tickets) {
            if (ticket.getAirportEnt() == air) {
                return ticket;
            }
        }
        return null;
    }
}

