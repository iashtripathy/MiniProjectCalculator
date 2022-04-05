import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void addingTruePositive(){
        assertEquals("Adding two integer numbers for True Positive", 4, calculator.add(2, 2), DELTA);
        assertEquals("Adding two double numbers for True Positive", 5.3, calculator.add(2.1, 3.2), DELTA);
    }

    @Test
    public void addingFalsePositive(){
        assertNotEquals("Adding two integer numbers for False Positive", 6, calculator.add(2, 2), DELTA);
        assertNotEquals("Adding two double numbers for False Positive", 7.3, calculator.add(2.1, 3.2), DELTA);
    }

    @Test
    public void subtractingTruePositive(){
        assertEquals("Subtracting two integer numbers for True Positive", 0, calculator.subtract(2, 2), DELTA);
        assertEquals("Subtracting two double numbers for True Positive", -1.1, calculator.subtract(2.1, 3.2), DELTA);
    }

    @Test
    public void subtractingFalsePositive(){
        assertNotEquals("Subtracting two integer numbers for False Positive", 6, calculator.subtract(2, 2), DELTA);
        assertNotEquals("Subtracting two double numbers for False Positive", -7.3, calculator.subtract(2.1, 3.2), DELTA);
    }
}