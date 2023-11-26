import chapterEight.CmoArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CmoArrayListTest {

    @Test
    public void newArrayListIsEmpty(){
        CmoArrayList Strings = new CmoArrayList();
        assertTrue(Strings.isEmpty());
    }

    @Test
    public void addOneElementListIsNotEmptyTest(){
        CmoArrayList Strings = new CmoArrayList();
        assertTrue(Strings.isEmpty());
        Strings.add(32);
        assertFalse(Strings.isEmpty());

    }
    @Test
    public void addAnotherElementListIsNotEmptyTest(){
        CmoArrayList Strings = new CmoArrayList();
        Strings.add(32);
        Strings.add(42);
        int size = Strings.getSize();
        assertEquals(2,size);
        assertFalse(Strings.isEmpty());


    }
    @Test
    public void removeELementListTest(){
        CmoArrayList Strings = new CmoArrayList();
        Strings.add(32);
        Strings.add(42);
        Strings.remove(32);

        int size = Strings.getSize();
        assertEquals(1,size);



        assertFalse(Strings.isEmpty());


    }
}
