import ChibuzorTask.Hcf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HcfTest {

    @Test
    public void testForHcf() {
        int  number1 = 24;
        int  number2 = 36;

        int result = Hcf.forHcf(number1,number2);
        assertEquals(12,result);
    }
}
