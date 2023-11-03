import chapterSeven.DuplicateNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class DuplicateNumberTest {

    @Test
    public void testForDuplicateNumber(){

        int [] array ={1,2,3,3,2,4,5,6};
       int [] answer ={2,3};
        int [] result = DuplicateNumber.bringOutSameNumber(array);

        assertArrayEquals(answer,result);
    }
    @Test
    void testForStringCharacter(){
        String str="Anna";
        String answer = "annA";
        boolean result = DuplicateNumber.checkPalindrome(str);
        assertTrue(answer,result);

    }
    @Test
    public void testForDominanceNumber() {
        int [] input = {9,3,10,7,4};
        int [] result = DuplicateNumber.findDorminanceElements(input);
        int [] expected = {10,7,4};
        assertArrayEquals(result,expected);

    }


    }

