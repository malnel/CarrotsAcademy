package com.academy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TravelOfficeTest {

    @Mock
    private Customer customerMock;
    @Mock
    private Trip tripMock;
    @Mock
    private Address addressMock;
    @Mock
    private Date dateMock;

    @InjectMocks
    private TravelOffice travelOffice;

    @Test
    public void addCustomer() {
        //Given
        Set<Customer> customerSet = new HashSet<>();
        //When
        customerSet.add(customerMock);
        //Then
        assertEquals(1, customerSet.size());
    }

    @Test
    public void addTrip() {
        //Given
        Map<String, Trip> tripMap = new HashMap<>();
        String name = "tripName";
        //When
        tripMap.put(name, tripMock);
        //Then
        assertEquals(1, tripMap.size());
    }

    @Test
    public void removeTrip() {
        //Given
        Map<String, Trip> tripMap = new HashMap<>();
        travelOffice.addTrip("trip", tripMock);
        //When
        travelOffice.removeTrip("trip");
        //Then
        assertEquals(null, tripMap.get("trip"));
    }

    @Test
    public void findCustomerByName() throws NoSuchFieldException {
        //Given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("customers")).set(new HashSet<>());
        Customer customer = new Customer("name");
        new FieldSetter(customer, Customer.class.getDeclaredField("address")).set(addressMock);
        new FieldSetter(customer, Customer.class.getDeclaredField("trip")).set(tripMock);
        travelOffice.returnAllCustomers().add(customerMock);
        //When
        travelOffice.returnAllCustomers().add(customer);
        //Then
        Customer custOutput = travelOffice.findCustomerByName("name");
        assertEquals(customer, custOutput);
//        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("customers")).set(new HashSet<>());
//        Customer customer = new Customer();
//        customer.setName("name");
//        customer.setAddress(addressMock);
//        customer.setTrip(tripMock);
//        Customer custOutput = travelOffice.findCustomerByName("name");
//        assertEquals(customer, custOutput);
    }

    @Test
    public void removeCustomer() {
        //Given
        Set<Customer> customerSet = new HashSet<>();
        travelOffice.addCustomer(customerMock);
        //When
        travelOffice.removeCustomer(customerMock);
        //Then
        assertEquals(0, customerSet.size());
    }

}