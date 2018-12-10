package pl.akademia;

public class Customer {

    private String name;
    private Address address;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' + "\n" +
                address.toString() + "\n" +
                trip.toString() +
                '}' + "\n\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
