package pl.akademia;

import java.security.PolicySpi;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {

    static HashSet<Customer> customers = new HashSet<>();
    HashMap<String, Trip> trips = new HashMap<>();


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getCustomerCount() {
        return customers.size();
    }

    public void addTrip(String name, Trip trip) {
        trips.put(name, trip);
    }

    boolean removeTrip(String name) {
        int originalTripsSize = trips.size();
        trips.remove(name);
        if (originalTripsSize > trips.size()) {
            return true;
        } else return false;
    }

    Customer findCustomerByName(String name) {
        Customer customer = new Customer();
        for (Customer c : customers) {
            if (name.equals(c.getName())) {
                customer = c;
            }
        }
        return customer;
    }

    boolean removeCustomer (Customer customer) {
        int originalCustomersSize = customers.size();
        customers.remove(customer);
        if (originalCustomersSize > customers.size()) {
            return true;
        } else return false;
    }

    public Set<Customer> returnAllCustomers() {
        return customers;
    }

    public Map<String, Trip> returnAllTrips() {
        return trips;
    }

    @Override
    public String toString() {
        String result = "";
        for (Customer cust : customers) {
            if (cust != null) {
                result += cust.toString();
            }
        }
        return result;
    }

//    public void addCustomer(Customer customer) {
//        Customer[] newCustomerTable = new Customer[customerTable.length + 1];
//        for (int i = 0; i < customerTable.length; i++) {
//            newCustomerTable[i] = customerTable[i];
//        }
//        newCustomerTable[newCustomerTable.length - 1] = customer;
//        customerTable = newCustomerTable;
//    }

//    public int getCustomerCount() {
//        return customerTable.length;
//    }

    //static Customer[] customerTable = new Customer[0];
}





