package com.academy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AbroadTripTest {

    @Test
    public void shouldReturn1500WhenPrice1000AndInsurance500() throws NoSuchFieldException {
        //given
        AbroadTrip abroadTrip = new AbroadTrip();
        abroadTrip.setPrice(1000);
        abroadTrip.setInsurance(500);
        double expectedOutput = 1500;
        //when
        double actualOutput = abroadTrip.getPrice();
        //then
        assertEquals(expectedOutput, actualOutput,0);

    }
}
