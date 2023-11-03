import ChibuzorTask.BinaryToDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryToDecimalTest {

    @Test
    public void testForBinaryToDecimal(){
        String binaryNumber="1101";
        int result =BinaryToDecimal.binaryDecimal(binaryNumber);
      assertEquals(13,result);
    }

    @Test
    public void testForDecimalToBinary(){
        int decimalNumber=13;
//        String result=BinaryToDecimal.decimalBinary(decimalNumber);
//        assertEquals(1101,result);
    }
}
