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
    public void addCustomer() throws NoSuchFieldException {
        //Given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("customers")).set(new HashSet<>());
        int sizeBeforeAdding = travelOffice.customers.size();
        //When
        travelOffice.customers.add(customerMock);
        int sizeAfterAdding = travelOffice.customers.size();
        //Then
        assertEquals(0, sizeBeforeAdding);
        assertEquals(1, sizeAfterAdding);
    }

    @Test
    public void addTrip() throws NoSuchFieldException {
        //Given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("trips")).set(new HashMap<>());
        int sizeBeforePuttingTrip = travelOffice.trips.size();
        String name = "tripName";
        //When
        travelOffice.trips.put(name, tripMock);
        int sizeAfterPuttingTrip = travelOffice.trips.size();
        //Then
        assertEquals(0, sizeBeforePuttingTrip);
        assertEquals(1, sizeAfterPuttingTrip);
    }

    @Test
    public void removeTrip() throws NoSuchFieldException {
        //Given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("trips")).set(new HashMap<>());
        travelOffice.addTrip("trip", tripMock);
        int sizeBeforeDeleting = travelOffice.trips.size();
        //When
        travelOffice.removeTrip("trip");
        int sizeAfterDeleting = travelOffice.trips.size();
        //Then
        assertEquals(null, travelOffice.trips.get("trip"));
        assertEquals(1, sizeBeforeDeleting);
        assertEquals(0, sizeAfterDeleting);
    }

    @Test
    public void findCustomerByName() throws NoSuchFieldException {
        //Given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("customers")).set(new HashSet<>());
        Customer customer = new Customer("name");
        new FieldSetter(customer, Customer.class.getDeclaredField("address")).set(addressMock);
        new FieldSetter(customer, Customer.class.getDeclaredField("trip")).set(tripMock);
        //When
        travelOffice.returnAllCustomers().add(customer);
        //Then
        Customer custOutput = travelOffice.findCustomerByName("name");
        assertEquals(customer, custOutput);
    }

    @Test
    public void removeCustomer() throws NoSuchFieldException {
        //Given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("customers")).set(new HashSet<>());
        travelOffice.addCustomer(customerMock);
        int sizeBeforeDeleting = travelOffice.customers.size();
        //When
        travelOffice.removeCustomer(customerMock);
        int sizeAfterDeleting = travelOffice.customers.size();
        //Then
        assertEquals(1, sizeBeforeDeleting);
        assertEquals(0, sizeAfterDeleting);
    }

}