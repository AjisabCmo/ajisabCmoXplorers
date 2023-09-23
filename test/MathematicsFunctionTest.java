import chapterSix.MathematicsFunction;
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
    public void testForpalindrome(){
        MathematicsFunction mathematicsFunction=new MathematicsFunction();
        boolean result=mathematicsFunction.palindrome(121);
        assertTrue(true, String.valueOf(result));
    }


    }

