import chapterTwo.FunctionThatTakeTwoNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionThatTakeTwoNumberTest {


    @Test
    public void testThatTwoNumber() {
        FunctionThatTakeTwoNumber functionThatTakeTwoNumber= new FunctionThatTakeTwoNumber();
        int result = FunctionThatTakeTwoNumber.twoNumber(2,2);
        assertEquals(4, result);
    }




}
