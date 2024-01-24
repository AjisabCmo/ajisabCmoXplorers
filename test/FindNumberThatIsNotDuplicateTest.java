import chapterSeven.FindNumberThatIsNotDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindNumberThatIsNotDuplicateTest {

    @Test
    public void testForNumberThatIsNotDuplicated(){
        int [] array ={2,2,1,3,3};
        int [] answer = {1};
        int [] result = FindNumberThatIsNotDuplicate.notDuplicateNumber(array);
        assertArrayEquals(answer,result);
    }
}
