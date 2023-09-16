package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTestTest {

    @Test
    public void turnBikeOnTest() {
        Biker ismailBiker = new Biker();


        ismailBiker.turnOn();

        boolean isOn = ismailBiker.checkIsOn();
        assertTrue(isOn);

    }


    @Test
    public void turnBikeOffTest() {

        Biker ismailBiker = new Biker();

        ismailBiker.turnOn();

        boolean isOn = ismailBiker.checkIsOn();
        assertTrue(isOn);

        ismailBiker.turnOff();
        boolean BIsOn = ismailBiker.checkIsOn();
        assertFalse(BIsOn);


    }

    @Test
    void accelerateSpeed() {
        Biker ismailBiker = new Biker();
        ismailBiker.turnOn();
        assertEquals(1,ismailBiker.checkGear());
        assertEquals(1,ismailBiker.checkSpeed());  //turn on is set to 1

        ismailBiker.accelerateSpeed();
        assertEquals(2,ismailBiker.checkSpeed());


    }

    @Test
    void accelerateSpeedAndGearAtTwo() {
        Biker ismailBiker = new Biker();
        ismailBiker.turnOn();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        assertEquals(21,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        assertEquals(23,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();

        assertEquals(2,ismailBiker.checkGear());


    }

    @Test
    void accelerateSpeedAndGearAtThree() {
        Biker ismailBiker = new Biker();
        ismailBiker.turnOn();

        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        assertEquals(21,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        assertEquals(23,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();

        assertEquals(31, ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        assertEquals(34,ismailBiker.checkSpeed());
        assertEquals(3,ismailBiker.checkGear());
    }
    @Test
    void accelerateSpeedAndGearAtFour(){
        Biker ismailBiker = new Biker();
        ismailBiker.turnOn();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        assertEquals(21,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        assertEquals(23,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        assertEquals(31, ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        assertEquals(34,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        ismailBiker.accelerateSpeed();
        assertEquals(43,ismailBiker.checkSpeed());
        ismailBiker.accelerateSpeed();
        assertEquals(47,ismailBiker.checkSpeed());
        assertEquals(4,ismailBiker.checkGear());

    }
    @Test
    void deaccelerateSpeedAndGearAtOne(){
        Biker ismailBiker = new Biker();
        ismailBiker.turnOn();
        assertEquals(1,ismailBiker.checkGear());
        assertEquals(1,ismailBiker.checkSpeed());

        ismailBiker.accelerateSpeed();
        assertEquals(2,ismailBiker.checkSpeed());
        ismailBiker.deaccelerateSpeed();
        assertEquals(1,ismailBiker.checkSpeed());



    }

      @Test
    void deaccelerateSpeedAndGearAtTwo(){
          Biker ismailBiker = new Biker();
          ismailBiker.turnOn();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          assertEquals(21,ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          assertEquals(23,ismailBiker.checkSpeed());
          assertEquals(2,ismailBiker.checkGear());
          ismailBiker.deaccelerateSpeed();
          assertEquals(21,ismailBiker.checkSpeed());
          ismailBiker.deaccelerateSpeed();
          assertEquals(19,ismailBiker.checkSpeed());
      }
      @Test
    void deaccelerateSpeedAndGearAtThree(){
          Biker ismailBiker = new Biker();
          ismailBiker.turnOn();

          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          assertEquals(21,ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          assertEquals(23,ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();

          assertEquals(31, ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          assertEquals(34,ismailBiker.checkSpeed());
          assertEquals(3,ismailBiker.checkGear());
          ismailBiker.deaccelerateSpeed();
          assertEquals(31,ismailBiker.checkSpeed());
          ismailBiker.deaccelerateSpeed();
          assertEquals(28,ismailBiker.checkSpeed());

      }
      @Test
    void deaccelerateSpeedAndGearAtFour(){
          Biker ismailBiker = new Biker();
          ismailBiker.turnOn();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          assertEquals(21,ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          assertEquals(23,ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          assertEquals(31, ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          assertEquals(34,ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          ismailBiker.accelerateSpeed();
          assertEquals(43,ismailBiker.checkSpeed());
          ismailBiker.accelerateSpeed();
          assertEquals(47,ismailBiker.checkSpeed());
          assertEquals(4,ismailBiker.checkGear());
          ismailBiker.deaccelerateSpeed();
          assertEquals(43,ismailBiker.checkSpeed());
          ismailBiker.deaccelerateSpeed();
          assertEquals(39,ismailBiker.checkSpeed());

      }
}









