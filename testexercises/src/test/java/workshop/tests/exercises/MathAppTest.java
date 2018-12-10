package workshop.tests.exercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import workshop.tests.exercises.workshop.tests.exercises.service.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

    @Mock
    MathService mathService;
    //MathService ms;

    @InjectMocks
    MathApp mathApp = new MathApp();

    @Test
    public void multiply() {
        when(mathService.multiply(10,20)).thenReturn(200);
        assertEquals(205, mathApp.multiplyAndAdd(10,20,5));
    }

    @Test
    public void divideAndAdd() {

    }

}