package pl.akademia;

public class TravelOffice {

    public static void main(String[] args) {

        Address address = new Address("Narutowicza", "93-193", "Lodz");
        Customer customer = new Customer("Joanna Nowak");
        Trip trip = new Trip(
                new Date(2018,3,12),
                new Date(2018, 3,28),
                "Ibiza");
        customer.assignTrip(trip);
        customer.setAddress(address);

        System.out.println(customer.getInfo());
    }
}
