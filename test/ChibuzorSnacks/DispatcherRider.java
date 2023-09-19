package ChibuzorSnacks;

public class DispatcherRider {

    public static int deliveryPay(int successfulDelivery) {
    int result = 0;

       if (successfulDelivery <= 50){
           result = (successfulDelivery * 160 )+ 5000;


       }if (successfulDelivery >= 50 && successfulDelivery <= 59) {
      result = (successfulDelivery * 200 )+ 5000;
      }if (successfulDelivery >=60 && successfulDelivery<=69){
           result=(successfulDelivery * 250)+5000;
        }if (successfulDelivery>=70){
           result =(successfulDelivery *500)+5000;
        }

   return result;
}


}

