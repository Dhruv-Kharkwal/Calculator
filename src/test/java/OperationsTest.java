
import static org.junit.Assert.*;

import calculatorApp.Operations;
import org.junit.Test;


public class OperationsTest {
    Operations obj = new Operations();
    private static final double DELTA = 1e-15;
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 6,obj.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, obj.factorial(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, obj.factorial(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, obj.factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, obj.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 0, obj.factorial(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 81, obj.power(3, 4), DELTA);
        assertEquals("Finding power for True Positive", 64, obj.power(4, 3), DELTA);
        assertEquals("Finding power for True Positive", 25, obj.power(5, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", -7, obj.power(3, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 99, obj.power(4, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -12, obj.power(5, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, obj.logarithm(1), DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 60, obj.logarithm(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 4.7, obj.logarithm(2.1), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 1, obj.sqrt(1), DELTA);
        assertEquals("Finding square root for True Positive", 9, obj.sqrt(81), DELTA);
        assertEquals("Finding square root for True Positive", 6, obj.sqrt(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 3, obj.sqrt(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, obj.sqrt(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, obj.sqrt(36), DELTA);

    }
}