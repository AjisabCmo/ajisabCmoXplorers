import chapterSix.TargetExist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TargetExistTest {

    @Test
    public void testForTargetExist(){
        int  number = 13579;
        int  index = 1;
        int index2 = 2;
        int target = 4;

        assertTrue(TargetExist.findingTargetExist(number,index,index2,target));
    }
}
