package workshop.tests.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void multiply() {
        //fail("Metoda w trakcie implementacji");

        //Given
        Math math = new Math();
        int a = 5, b = 1;
        int expectedOutput = 5;
        //When
        int actualOutput = math.multiply(a, b);
        //then
        assertEquals(expectedOutput, actualOutput);
    }
}