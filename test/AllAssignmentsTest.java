import ChibuzorTask.AllAssignment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

@Test
    public void testForElementThatOccur(){
    AllAssignment allAssignment = new AllAssignment();
    int [] array ={1,2,3,4,5,6};


    boolean result =allAssignment.occur(array);
    assertTrue(true, String.valueOf(result));


}
@Test
    public void testForOddPosition(){
    AllAssignment allAssignment = new AllAssignment();
    int [] array ={1, 2, 3, 4, 5, 6, 7, 8, 9};
    int [] expected = {2,4,6,8};
    int [] result = new int[]{allAssignment.oddPosition(array)};
    assertEquals(expected,allAssignment.oddPosition(array));
}




}