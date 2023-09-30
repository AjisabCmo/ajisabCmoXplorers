package ChibuzorTask;

import java.util.Scanner;

public class Assignment1{
    public static int largestElement( int number) {


    Scanner scanner =new Scanner(System.in);

    int [] array=new int [5];

       for ( int count = 0; count < 5; count++) {

           System.out.println("enter number");
           number= scanner.nextInt();
           array[count]=number;





       }
       int largest =array[0];

       for (int index=0; index<array.length;index++){
           if (array[index] > largest){
               largest = array[index];
           }
       }
       return largest;
    }

    public static void main(String[] args) {
        int result = largestElement(5);
        System.out.println(result);
    }
}
