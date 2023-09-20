package chapterTwo;

import chapterSix.DispatcherRider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispatcherRiderTest {


    @Test
    public void testThatCalculateDeliveryPay(){
        DispatcherRider dispatcherRider = new DispatcherRider();
        int number = DispatcherRider.deliveryPay(25);
        assertEquals(9000,number);
    }

    @Test
    public void testThatCalculatedDeliveryPayLessThan59() {
        DispatcherRider dispatcherRider = new DispatcherRider();
        int number = DispatcherRider.deliveryPay(55);
        assertEquals(16000, number);

    }

    @Test
    public void testThatCalculatedDeliveryPayLessThan69(){
        DispatcherRider dispatcherRider = new DispatcherRider();
        int number = DispatcherRider.deliveryPay(65);
        assertEquals(21250,number);

        }


    @Test
    public void testThatCalculatedDeliveryPayLessThan70(){
        DispatcherRider dispatcherRider = new DispatcherRider();
        int number = DispatcherRider.deliveryPay(80);
        assertEquals(45000,number);
    }

}