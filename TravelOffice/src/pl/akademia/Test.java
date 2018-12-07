package pl.akademia;

public class Test {

    public static void main(String[] args) {

        Address address1 = new Address("Narutowicza", "93-193", "Lodz");
        Customer customer1 = new Customer("Joanna Nowak");
        Date d1 = new Date();
        d1 = d1.saveDate("2018/3/12");
        Date d2 = new Date();
        d2 = d2.saveDate("2018.3.28");
        AbroadTrip trip1 = new AbroadTrip(d1, d2, "Ibiza", 2900);
        trip1.setInsurance(600);
        customer1.assignTrip(trip1);
        customer1.setAddress(address1);


        Address address2 = new Address("Sklodowskiej", "00-123", "Warszawa");
        Customer customer2 = new Customer("Karolina Kot");
        DomesticTrip trip2 = new DomesticTrip(
                new Date(2018, 7, 13),
                new Date(2018, 7, 19),
                "Karpacz",
                4500);
        trip2.setOwnArrivalDiscount(1000);
        customer2.assignTrip(trip2);
        customer2.setAddress(address2);

        Address address3 = new Address("Kilinskiego", "59-300", "Lubin");
        Customer customer3 = new Customer("Adam Lis");
        Trip trip3 = new Trip(
                new Date(2017, 8, 1),
                new Date(2017, 8, 14),
                "Sri Lanka",
                6200);
        customer3.assignTrip(trip3);
        customer3.setAddress(address3);

        TravelOffice travelOffice = new TravelOffice();

        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer3);


        System.out.println("Number of customers: " + travelOffice.getCustomerCount() + "\n");
        System.out.println(travelOffice.toString());

    }

}
