import chapterEight.CmoArrayList;
import chapterEight.CmoSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CmoSetTest {
    @Test
    public void setIsEmptyTest() {
        CmoSet Strings = new CmoSet();
        assertTrue(Strings.isEmpty());
    }
    @Test
    public void addOneSetIsNotEmptyTest(){
        CmoSet Strings = new CmoSet();
        assertTrue(Strings.isEmpty());
        Strings.add(42);
        assertFalse(Strings.isEmpty());

    }

    @Test
    public void addAnotherElementListIsNotEmptyTest(){
        CmoSet Strings = new CmoSet();
        Strings.add(42);
        Strings.add(45);
        int size = Strings.getSize();
        assertEquals(2,size);
        assertFalse(Strings.isEmpty());


    }
    @Test
    public void removeSetTest(){
        CmoSet Strings = new CmoSet();
        assertTrue(Strings.isEmpty());
        Strings.add(42);
        Strings.add(45);
        Strings.remove(42);
        int size = Strings.getSize();
        assertEquals(1,size);

        assertFalse(Strings.isEmpty());

    }
}