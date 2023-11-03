import chapterSeven.ArrayOfStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfStringsTest {

    @Test
    void TestForNumberOfDigits(){
     String number ="ABC21F,13CPZ,A1L";
   assertEquals(5, ArrayOfStrings.numberOfDigit(number));




    }
}
