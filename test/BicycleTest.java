import chapterTwo.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleTest {

    @Test
    public void turnBicycleOnTest(){
        Bicycle ismailBicycle = new Bicycle();

        ismailBicycle.turnOn();

        boolean isOn = ismailBicycle.checkIsOn();
        assertTrue(isOn);
    }

    @Test
    void turnBicycleOffTest(){
        Bicycle ismailBicycle = new Bicycle();

        ismailBicycle.turnOn();

        boolean isOn= ismailBicycle.checkIsOn();
        assertTrue(isOn);

        ismailBicycle.turnOff();
        boolean BicIsOn= ismailBicycle.checkIsOn();
        assertFalse(BicIsOn);
    }
@Test
    void accelerate(){
        Bicycle ismailBicycle= new Bicycle();

    ismailBicycle.turnOn();

    boolean isOn= ismailBicycle.checkIsOn();
    assertTrue(isOn);

    ismailBicycle.accelerate();
    //gear one
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
   assertEquals(20,ismailBicycle.checkSpeed());
   //gear at two
    ismailBicycle.accelerate();
    assertEquals(21,ismailBicycle.checkSpeed());

    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    assertEquals(23,ismailBicycle.checkSpeed());
    //gear at three
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();

    assertEquals(26,ismailBicycle.checkSpeed());
    ismailBicycle.accelerate();


    //gear at four
    ismailBicycle.accelerate();
    ismailBicycle.accelerate();

    ismailBicycle.accelerate();



    assertEquals(30,ismailBicycle.checkSpeed());












}




}

