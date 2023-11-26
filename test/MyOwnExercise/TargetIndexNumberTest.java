package MyOwnExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetIndexNumberTest {


    @Test
    public void testThatAnArrayCanReturnTargetIndex(){

        int []nums ={2,7,11,15};
        int target = 9;
        int [] actual = {0,1};
        assertArrayEquals(actual,TargetIndexNumber.twoSum(nums,target));
    }


}