import ChapterFour.CalculateFactorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateFactorialTest {



    @Test
    public void testCalculatefactorial(){
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        int result= CalculateFactorial.calculateFactorial(5);
        assertEquals(120,result);
    }

    @Test
    public void testCalculateExponential(){
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        double result = CalculateFactorial.calculateExponential(5);
        assertEquals(2.717,result);
    }
    @Test
    public void testCalculateExponentialX(){
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        double result = CalculateFactorial.calculateExponentialX(5);
        assertEquals(91.41,result);
    }
}
