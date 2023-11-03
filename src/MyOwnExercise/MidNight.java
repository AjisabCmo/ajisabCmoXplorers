package MyOwnExercise;


import java.util.Scanner;

public class MidNight {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];
        int total = 0;
        int count;
        for (count = 0; count < myArray.length; count++) {
            System.out.println("Enter a number ");
            myArray[count] = scanner.nextInt();
            total = total + myArray[count];


        }

        double average =(double) total/count;
//        for (int count = 0; count < myArray.length; count++)
//        System.out.println("myArray[" + count + "] = " + myArray[count]);
        System.out.println(total);
        System.out.println(average);
//
//
//        int total=0;
//        int count;
//        int largest =0;
//        int smallest=0;
//        for ( count = 0; count < 2 ; count ++ ){
//            System.out.println("enter a number:");
//          int  number = scanner.nextInt();
//            smallest = total;
//
//            total = total + number;
//
//          if   (number > largest){
//              largest = number;
//
//
//          } else if (number < smallest) {
//              smallest =number;
//
//          }
//
//        }
//        double average = (double) total /count;
//        System.out.println(total);
//        System.out.println(average);
//        System.out.println(largest);
//        System.out.println(smallest);
    }
}
