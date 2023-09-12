package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {


    @Test
    void turnAcOnTest() {
        //given
        AirConditioner ismailAirConditioner = new AirConditioner();

        //when
         ismailAirConditioner.turnOn();

         //check
        boolean isOn = ismailAirConditioner.checkIsOn();
        assertTrue(isOn);


    }

    @Test
    void turnAcOffTest() {
        AirConditioner ismailAirConditioner = new AirConditioner();

        ismailAirConditioner.turnOn();

        boolean isOn = ismailAirConditioner.checkIsOn();
        assertTrue(isOn);
        ismailAirConditioner.turnOff();
        boolean AcIsOn = ismailAirConditioner.checkIsOn();
        assertFalse(AcIsOn);
    }

    
    @Test
    public void increaseAcTemperatureTest() {
        AirConditioner ismailAirConditioner = new AirConditioner();
        ismailAirConditioner.turnOn();
        ismailAirConditioner.increaseTemperature();
       // int temperature = ismailAirConditioner.checkTemperature();
        assertEquals(17, ismailAirConditioner.checkTemperature());

    }

    @Test

    public void decreaseTemperatureTest() {
        AirConditioner ismailAirConditioner = new AirConditioner();
        ismailAirConditioner.turnOn();
        int temperature = ismailAirConditioner.checkTemperature();
        assertEquals(16, temperature);
        ismailAirConditioner.increaseTemperature();
        assertEquals(17, ismailAirConditioner.checkTemperature());
        ismailAirConditioner.decreaseTemperature();
        int checkTemp = ismailAirConditioner.checkTemperature();
        assertEquals(16 , checkTemp);
    }




    @Test
    public  void decreaseAirConditionerBelowSixteenTest() {
        AirConditioner ismailAirConditioner = new AirConditioner();
        ismailAirConditioner.decreaseTemperature();
        int temperature = ismailAirConditioner.checkTemperature();
        assertEquals(16, temperature);
    }



    @Test
    public void increaseAirConditionerAboveThirtyTest(){
        AirConditioner ismailAirConditioner = new AirConditioner();
        assertEquals(16,ismailAirConditioner.checkTemperature());
       ismailAirConditioner.increaseTemperatureByNUmberEntered(14);
        assertEquals(30, ismailAirConditioner.checkTemperature());
        ismailAirConditioner.increaseTemperatureByNUmberEntered(70);
        assertEquals(30, ismailAirConditioner.checkTemperature());
    }
}
