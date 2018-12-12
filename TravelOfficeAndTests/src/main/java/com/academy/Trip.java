package com.academy;

import java.util.Objects;

public abstract class Trip {

    private Date start;
    private Date end;
    private String destination;
    private double price;

    public Trip(Date start, Date end, String destination, double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

    public Trip() {
    }

    @Override
    public String toString() {
        return (
                "Destination: " + destination +
                " start: " + start.toString() +
                " end: " + end.toString() +
                " price: " + this.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Double.compare(trip.price, price) == 0 &&
                Objects.equals(start, trip.start) &&
                Objects.equals(end, trip.end) &&
                Objects.equals(destination, trip.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, destination, price);
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
