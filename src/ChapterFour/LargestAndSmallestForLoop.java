package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("enter the number you want:");
       int digit = scanner.nextInt();
       int number;

       int largest = 0;
       int smallest = digit;

       for (int index = 1; index <=digit; index++) {
            System.out.println("enter number");
             number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }


            if (number<smallest) {
                smallest =number;
            }

        }
        System.out.println("the largest is " + largest);
        System.out.println("the smallest is " + smallest);
    }
}