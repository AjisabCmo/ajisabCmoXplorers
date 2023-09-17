package ChapterFour;

import java.util.Scanner;

public class CreatingComparator {
    public static void main(String[] args) {

       Scanner semicolon =new Scanner(System.in);

       System.out.println("Enter the first number: ");
       int firstNumber= semicolon.nextInt();
       System.out.println("Enter the second number: ");
       int secondNumber = semicolon.nextInt();



      if (firstNumber == secondNumber){
            System.out.println("0");
      }
       if (firstNumber > secondNumber){
           System.out.println("1");
       }else {
          System.out.println("-1");
        }


    }
}
