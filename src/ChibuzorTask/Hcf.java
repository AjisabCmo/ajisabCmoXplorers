package ChibuzorTask;

public class Hcf {

public static int forHcf(int number1, int number2){

   int  hcf =0 ;

   for (int count = 1; count <= number1 || count <= number2 ; count++) {
       if (number1 % count  == 0 &&  number2 % count == 0){
           hcf= count;

       }
   }


    return hcf;
}
}
