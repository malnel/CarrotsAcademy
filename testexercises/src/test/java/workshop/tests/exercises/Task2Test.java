package workshop.tests.exercises;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    static Task2 task2;
    @BeforeClass
    public static void initializeTest() {
        task2 = new Task2();
    }

    @Test
    public void whenASmileTrueBSmileTrue_thenTrue() {
        //given
        boolean aSmile = true;
        boolean bSmile = true;
        boolean expectedValue = true;
        //when
        boolean actuaLValue = task2.monkeyTrouble(aSmile,bSmile);
        //then
        assertEquals(expectedValue, actuaLValue);
    }

    @Test
    public void whenASmileFalseBSmileFalse_thenTrue() {
        //given
        boolean aSmile = false;
        boolean bSmile = false;
        boolean expectedValue = true;
        //when
        boolean actuaLValue = task2.monkeyTrouble(aSmile,bSmile);
        //then
        assertEquals(expectedValue, actuaLValue);
    }

    @Test
    public void whenASmileFalseBSmileTrue_thenFalse() {
        //given
        boolean aSmile = false;
        boolean bSmile = true;
        boolean expectedValue = false;
        //when
        boolean actuaLValue = task2.monkeyTrouble(aSmile,bSmile);
        //then
        assertEquals(expectedValue, actuaLValue);
    }

    @Test
    public void whenASmileTrueBSmileFalse_thenFalse() {
        //given
        boolean aSmile = true;
        boolean bSmile = false;
        boolean expectedValue = false;
        //when
        boolean actuaLValue = task2.monkeyTrouble(aSmile,bSmile);
        //then
        assertEquals(expectedValue, actuaLValue);
    }

}