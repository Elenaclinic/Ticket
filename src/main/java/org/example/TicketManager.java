package org.example;

import java.util.Arrays;

public class TicketManager {
    private final TicketRepository repository;

    private Ticket[] tickets = new Ticket[0];

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void save(Ticket product) {
        repository.save(product);
    }

    public Ticket[] findAll(String airportOut,String airportEnt) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (matches(ticket, airportOut, airportEnt)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    private boolean matches(Ticket ticket, String airportOut, String airportEnt) {
        if (ticket.getAirportOut().equals(airportOut)) {
            return ticket.getAirportEnt().equals(airportEnt);
        }
        return false;
    }
}
