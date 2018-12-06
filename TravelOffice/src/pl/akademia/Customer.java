package pl.akademia;

public class Customer {

    String name;
    Address address;
    Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    public String getInfo() {
        return "Customer{" +
                "name='" + name + '\'' + "\n" +
                address.getInfo() + "\n" +
                trip.getInfo() +
                '}' + "\n\n";
    }

}
