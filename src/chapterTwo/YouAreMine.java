package chapterTwo;

import java.util.Scanner;

public class YouAreMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("enter the number you want:");
       int digit = scanner.nextInt();
            int number;

         int highest = 0; //Integer.MIN_VALUE;
          int lowest = digit;

       for (int index = 1; index <=digit; index++) {
            System.out.println("enter number");
             number = scanner.nextInt();
            if (number > highest) {
                highest = number;
            }


            if (number<lowest) {
                lowest =number;
            }

        }
        System.out.println("the hishest is " + highest);
        System.out.println("the lowest is " + lowest);
    }
}