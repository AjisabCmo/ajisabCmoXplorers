import chapterEight.CmoStack;
import chapterEight.StackOverFlowError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CmoStackTest {



    @Test
    public void CmoStackIsEmpty(){
        CmoStack<Integer> cmoStack = new CmoStack<>();
        assertTrue(cmoStack.isEmpty());

    }

    @Test
    public void testThatSizeOfCmoStackIsZero(){
        CmoStack<String> cmoStack = new CmoStack<>();
        assertEquals(0,cmoStack.size());

    }
    @Test
    public void testThatCmoStackCanPush(){
        CmoStack<String> cmoStack = new CmoStack<>();
        cmoStack.push("ismail");
        assertEquals(1,cmoStack.size());
        assertFalse(cmoStack.isEmpty());


    }
    @Test
    public void testThatCmoStackCannotExceedTheDefaultCapacity(){
        CmoStack<String> cmoStack = new CmoStack<>();
        cmoStack.push("ismail");
        cmoStack.push("simbiat");
        cmoStack.push("ayomide");
       cmoStack.push("tomiwa");
        assertThrows(StackOverFlowError.class,()-> cmoStack.push("tomiwa"));

    }
    @Test
    public void testThatCmoStackIsFull(){
        CmoStack<String> cmoStack = new CmoStack<>();

        cmoStack.push("ismail");
        cmoStack.push("simbiat");
        cmoStack.push("ayomide");
        assertTrue(cmoStack.isFull());

    }
}
