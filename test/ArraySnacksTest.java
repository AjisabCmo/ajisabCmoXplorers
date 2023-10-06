import chapterSeven.ArraySnacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySnacksTest {

    @Test
    public void TestToGetOddPosition(){
        ArraySnacks arraySnacks= new ArraySnacks();
        int [] array ={5,4,1,0,6,7,9};
        int result=arraySnacks.getOddPosition(array);
        assertEquals(11,arraySnacks.getOddPosition(array));
    }
    @Test
    public void TestToGetEvenPosition(){
        ArraySnacks arraySnacks=new ArraySnacks();
        int [] array ={5,4,1,0,6,7,9};
        int result = arraySnacks.getEvenPosition(array);
        assertEquals(21,result);
    }
    @Test
    public void TestToAddOddNumber(){
        int [] array ={5,4,1,0,6,7,9};
        int result = ArraySnacks.addOddNumber(array);
        assertEquals(22,result);


    }
    @Test
    public void TestToAddEvenNumber(){
        int [] array ={5,4,1,0,6,7,9};
        int result= ArraySnacks.addEvenNumber(array);
        assertEquals(10,ArraySnacks.addEvenNumber(array));
    }


    }

