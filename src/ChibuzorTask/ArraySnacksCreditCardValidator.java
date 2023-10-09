package ChibuzorTask;

import java.util.Scanner;

public class ArraySnacksCreditCardValidator {

    public static void main(String[] args) {
//        int [] array = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
//        int sum =1;
//        int count =0;
//        for (count = 0 ; count <array.length;count ++){
//            if (array[count]%2!=0){
//                sum =sum *2 + array[count];
//            }
//            if (sum%10==0){
//                System.out.println(" valid ");
//            }else{
//                System.out.println("invalid ");
//            }
//
//        }
//


        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Hello,Kindly Enter Card Details To Verify :");
        long number = scanner.nextLong();

        long [] array = new long[]{number};

       long sum =1;
       int  count =0;
       for (count =0;count< array.length;count++){
           if (array[count]%2!=0){
               sum = sum *2 + array[count];
           }
           if (sum%10==0){
               System.out.println("valid");
           }else {
               System.out.println("invalid");
           }
       }

   }








}
