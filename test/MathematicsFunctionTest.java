import chapterSix.MathematicsFunction;
import com.google.common.math.BigIntegerMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathematicsFunctionTest {



    @Test
    public void testForSquare(){
        MathematicsFunction mathematicsFunction= new MathematicsFunction();
        int result = mathematicsFunction.mysquare(6);
        assertEquals(36,result);
    }

    @Test
    public void testForDivide(){
        MathematicsFunction mathematicsFunction =new MathematicsFunction();
        int result =mathematicsFunction.divide(25,5);
        assertEquals(5,mathematicsFunction.divide(25,5));
    }
    @Test
    public void testForPalindrome(){
        MathematicsFunction mathematicsFunction=new MathematicsFunction();
        boolean result=mathematicsFunction.palindrome(54145);
     assertTrue(true, String.valueOf(result));    }
    @Test
    public void testForFactorial(){

        MathematicsFunction mathematicsFunction = new MathematicsFunction();
        int result=mathematicsFunction.factorial(5);
        assertEquals(120,mathematicsFunction.factorial(5));

    }
    @Test
    public void testForFactor(){
        MathematicsFunction mathematicsFunction = new MathematicsFunction();
        int result=mathematicsFunction.factor(10);
        assertEquals(4,result);
    }
    @Test
    public void testForEvenAndOddNumber(){
        MathematicsFunction mathematicsFunction=new MathematicsFunction();
        boolean result =mathematicsFunction.evenAndOddNumbers(3);
        assertEquals(false,result);
    }
  @Test
    public void testForPrimeNumber(){

  }
    }

