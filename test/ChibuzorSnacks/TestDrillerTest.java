package ChibuzorSnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {




    @Test
    public  void testTheNumberOfCopies(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(4);
        assertEquals(2000,number);
    }

    @Test
    public void testTheNumberOfCopiesForFiveAndNine(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(6);
        assertEquals(1800,number);
    }
    @Test
    public void testThatTheNumberOfCopiesForTenAndTwentyNine(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(11);
        assertEquals(1600,number);
    }
    @Test
    public void testThatTheNumberOfCopiesForThirtyAndFourtyNine(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(35);
        assertEquals(1500,number);
    }
    @Test
    public void testThatTheNumberOfCopiesForFiftyAndNinetyNine(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(55);
        assertEquals(1300,number);
    }
    @Test
    public void testThatTheNumberOfCopiesForHundredAndOneNinetyNine(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(100);
        assertEquals(1200,number);
    }
    @Test
    public void testThatNumberOfCopiesForTwoHundreadAndFourNightyNine(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(250);
        assertEquals(1100,number);
    }
    @Test
    public void testThatNumberOfCopiesForFiveHundred(){
        Driller driller = new Driller();
        int number= Driller.numberOfCopies(600);
        assertEquals(1000,number);
    }
}
