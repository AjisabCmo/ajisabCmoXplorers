import chapterSeven.Lcm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LcmTest {
    @Test
    public void testForLcmOfOneNumber(){
        int [] result = {2,5};
        assertArrayEquals(result, Lcm.calculateLcm(10));
    }
}
