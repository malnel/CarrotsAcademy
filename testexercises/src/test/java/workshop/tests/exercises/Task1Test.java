package workshop.tests.exercises;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {
    static Task1 task1;

    @Before
    public void initializeTest() {
        task1 = new Task1();
    }
    @Test
    public void whenWeekdayTrueAndVacationFalse_thenFalse() {

        //given
        //Task1 task1 = new Task1();
        boolean week = true;
        boolean vac = false;
        boolean expectedOutput = false;
        //When
        boolean actualOutput = task1.sleepIn(week,vac);
        //Then
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnTrueWhenWeekdayFalseAndVacationFalse() {

        //given
        //Task1 task1 = new Task1();
        boolean week = false;
        boolean vac = false;
        boolean expectedOutput = true;
        //When
        boolean actualOutput = task1.sleepIn(week,vac);
        //Then
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnTrueWhenWeekdayFalseAndVacationTrue() {

        //given
        //Task1 task1 = new Task1();
        boolean week = false;
        boolean vac = true;
        boolean expectedOutput = true;
        //When
        boolean actualOutput = task1.sleepIn(week,vac);
        //Then
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnTrueWhenWeekdayTrueAndVacationTrue() {

        //given
        Task1 task1 = new Task1();
        boolean week = true;
        boolean vac = true;
        boolean expectedOutput = true;
        //When
        boolean actualOutput = task1.sleepIn(week,vac);
        //Then
        assertEquals(expectedOutput, actualOutput);
    }




}