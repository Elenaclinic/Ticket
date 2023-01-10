package org.example;

public class Ticket implements Comparable<Ticket> {


    protected int id;
    protected int price;
    protected String airportOut;
    protected String airportEnt;
    protected int timeInMinutes;

    public Ticket(int id, int price, String airportOut, String airportEnt, int timeInMinutes) {
        this.id = id;
        this.price = price;
        this.airportOut = airportOut;
        this.airportEnt = airportEnt;
        this.timeInMinutes = timeInMinutes;
    }

    public int getId() {
        return id;
    }



    public String getAirportEnt() {
        return airportEnt;
    }


    public String getAirportOut() {
        return airportOut;
    }


    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        }
        return 0;
    }
}
