import chapterSix.MathematicsFunction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
