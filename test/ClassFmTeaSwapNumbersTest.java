import chapterSeven.ClassFmTeaSwapNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassFmTeaSwapNumbersTest {


@Test
    public void testForSwapNumber(){
    ClassFmTeaSwapNumbers classFmTeaSwapNumbers = new ClassFmTeaSwapNumbers();
    int [] numbers={10,20,30,40,50};
   int firstIndex=1;
   int secondIndex=3;
    int [] answer ={10,40,30,20,50};
     int[] result = classFmTeaSwapNumbers.swapNumbers(numbers,firstIndex,secondIndex);
     assertArrayEquals(answer,result);
}
}
