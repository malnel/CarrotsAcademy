package com.academy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DomesticTripTest {

    @Test
    public void shouldReturn800WhenPrice1000AndOwnArrivalDiscount200() {
        //Given
        DomesticTrip domesticTrip = new DomesticTrip();
        domesticTrip.setPrice(1000);
        domesticTrip.setOwnArrivalDiscount(200);
        double expectedOutput = 800;
        //When
        double actualOutput = domesticTrip.getPrice();
        //Then
        assertEquals(expectedOutput, actualOutput, 0);
    }
}
