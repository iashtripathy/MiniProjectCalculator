import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSqrt(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        double actual=scientificCalculator.squareroot(25.0);
        double expected=5.0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNaturalLog(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        double num=145.256;
        double actual= scientificCalculator.naturalLog(num);
        double expected=4.978497702968366;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testFactorial(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        int actual= scientificCalculator.factorial(5);
        int expected=120;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testPower(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        double num=3.0;
        double actual=scientificCalculator.power(num,num);
        double expected=27.0;
        Assertions.assertEquals(expected,actual);
    }
}