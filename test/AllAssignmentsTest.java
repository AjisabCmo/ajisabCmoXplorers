import ChibuzorTask.AllAssignment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllAssignmentsTest {

    //    @Test
//    public void largest(){
//        AllAssignment allAssignment = new AllAssignment();
//      int  result = allAssignment.largest(1,2,9);
//        assertEquals(9,(result));
    //   }
    @Test
    public void testForlargest() {
        AllAssignment allAssignment = new AllAssignment();
       int [] array  = {10, 40, 30, 20, 11, 200, 812};
       int result = allAssignment.largestNumber(array);
        assertEquals(812,result);

    }

@Test
    public void testForReverse(){
    AllAssignment allAssignment = new AllAssignment();
    int [] array  = {10, 40, 30, 20, 11, 200, 812};
    int [] expected={812,200,11,20,30,40,10};
    int[] result = allAssignment.reverse(array);
    assertArrayEquals( expected,allAssignment.reverse(array));

}




}