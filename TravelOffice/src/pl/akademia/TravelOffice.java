package pl.akademia;

public class TravelOffice {

    public static void main(String[] args) {

        Address address1 = new Address("Narutowicza", "93-193", "Lodz");
        Customer customer1 = new Customer("Joanna Nowak");
        Trip trip1 = new Trip(
                            new Date(2018,3,12),
                            new Date(2018, 3,28),
                            "Ibiza");
        customer1.assignTrip(trip1);
        customer1.setAddress(address1);

        System.out.println(customer1.getInfo());
    }
}
