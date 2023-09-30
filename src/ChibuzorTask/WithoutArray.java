package ChibuzorTask;

import java.util.Scanner;

public class WithoutArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
       int count =0;
       int maximum = 0;
       System.out.println("Enter a score:");
        int score = scanner.nextInt();
      // String name ="";
        int minimum = score;


        for ( count = 0; count < 9; count++) {
            System.out.println("Enter a score:");
            score = scanner.nextInt();


            total += score;
            if (score >maximum) {
             maximum = score;
            }
             if (score< maximum) {
              minimum = score;


            }


        }



        System.out.println("the minimum is :" + minimum);
        double average = (double) total / count;
        System.out.println("The average is :" + average);
        System.out.println("the total is :" + total);

        System.out.println("the maximum is :"+maximum);
    }
}
