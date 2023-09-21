package ChapterFour;//package ChapterFour;

import java.util.Scanner;

public class FindingTwoLargest {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int count = 0;
       int number = 0;
      int largest1 = 0;
       int largest2 = largest1;

       while (count < 10){

           System.out.println("enter the number: ");
           number = scanner.nextInt();
           count++;
          if (number >= largest1){
              largest2 = largest1 ;
               largest1 = number;
         } else if (number > largest2 ){
              largest2 = number;

          }

      }
       System.out.println("the first largest is :"+largest1);
       System.out.println("the second largest is :"+ largest2);
   }
}



