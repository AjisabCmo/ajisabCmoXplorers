import chapterSeven.MinMaxArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxArrayTest {

    @Test
    public void testForAddMinMax(){
        MinMaxArray minMaxArray = new MinMaxArray();
        int [] array={5,3,4,1,2};
        int result =minMaxArray.addNumber(array);
        assertEquals(15,result);

    }
    @Test
    public void testForMininmum(){
        int[] array ={5,3,4,1,2};
        int result = MinMaxArray.minimumNumber(array);
        assertEquals(1,result);

    }


    }

