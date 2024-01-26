import chapterSeven.PlusOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    @Test
    public void testTheGivenNumberPlusOne(){
        int [] array = {1,2,3};
        int [] answer = {1,2,4};
        int [] result = PlusOne.NumberPlusOne(array);
        assertArrayEquals(answer,result);
    }
}
