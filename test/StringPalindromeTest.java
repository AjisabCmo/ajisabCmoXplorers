import chapterSix.StringPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringPalindromeTest {


    @Test
    void testForIsPalindrome(){
        String word ="+1001+";



        boolean result = StringPalindrome.forIsPalindrome(word);
        assertTrue(result);
    }

    @Test
    void testForIsAnagram(){

        String s1 = "live ";
        String s2 = "evil";

    boolean result =StringPalindrome.forIsAnagram(s1,s2);
        assertTrue(result);

    }
}
