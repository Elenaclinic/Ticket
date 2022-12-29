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
        this.airportEnt = airportOut;
        this.airportOut = airportEnt;
        this.timeInMinutes = timeInMinutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAirportEnt() {
        return airportEnt;
    }

    public void setAirportEnt(String airportEnt) {
        this.airportEnt = airportEnt;
    }

    public String getAirportOut() {
        return airportOut;
    }

    public void setAirportOut(String airportOut) {
        this.airportOut = airportOut;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }


    @Override
    public int compareTo(Ticket o) {
          return price - o.getPrice();
        }
}
