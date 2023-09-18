package ChibuzorSnacks;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class DispatchRider {

   public static int calculateDeliveryPay(int successfulDelivery) {

       int commision = 0;

       if (successfulDelivery < 50) {
           commision = successfulDelivery * 160 + 5000;
       }
       else if (successfulDelivery >= 50 || successfulDelivery <= 59) {
           commision = successfulDelivery * 200 + 5000;
       }
       else if (successfulDelivery >= 60 || successfulDelivery <= 69) {
           commision = successfulDelivery * 250 + 5000;


       }
       else if (successfulDelivery >= 70) {
           commision = successfulDelivery * 500 + 5000;
       }


       return commision;
   }


    public static void main(String[] args) {
        int result = calculateDeliveryPay(70);

        System.out.println(result);
    }
}
