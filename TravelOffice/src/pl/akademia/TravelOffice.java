package pl.akademia;

public class TravelOffice {

    static Customer[] customerTable = new Customer[0];

    public static void main(String[] args) {

        Address address1 = new Address("Narutowicza", "93-193", "Lodz");
        Customer customer1 = new Customer("Joanna Nowak");
        Trip trip1 = new Trip(
                new Date(2018, 3, 12),
                new Date(2018, 3, 28),
                "Ibiza");
        customer1.assignTrip(trip1);
        customer1.setAddress(address1);

        Address address2 = new Address("Sklodowskiej", "93-193", "Lodz");
        Customer customer2 = new Customer("Karolina Kot");
        Trip trip2 = new Trip(
                new Date(2018, 7, 13),
                new Date(2018, 7, 19),
                "Karpacz");
        customer2.assignTrip(trip2);
        customer2.setAddress(address2);

        Address address3 = new Address("Kilinskiego", "93-193", "Lodz");
        Customer customer3 = new Customer("Adam Lis");
        Trip trip3 = new Trip(
                new Date(2017, 8, 1),
                new Date(2017, 8, 14),
                "Sri Lanka");
        customer3.assignTrip(trip3);
        customer3.setAddress(address3);

        TravelOffice travelOffice = new TravelOffice();
        
        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer3);

        System.out.println("Number of customers: " + travelOffice.getCustomerCount() + "\n");
        System.out.println(travelOffice.getInfo());

    }

    public void addCustomer(Customer customer) {
        Customer[] newCustomerTable = new Customer[customerTable.length + 1];
        for (int i = 0; i < customerTable.length; i++) {
            newCustomerTable[i] = customerTable[i];
        }
        newCustomerTable[newCustomerTable.length - 1] = customer;
        customerTable = newCustomerTable;
    }

    public int getCustomerCount() {
        return customerTable.length;
    }

    public String getInfo() {
        String result = "";
        for (Customer cust : customerTable) {
            if (cust != null) {
                result += cust.getInfo();
            }
        }
        return result;
    }

}





