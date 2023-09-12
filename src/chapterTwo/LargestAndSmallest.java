package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number you want :");
        int digit = scanner.nextInt();

        System.out.println();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;




            for (int counter=0; counter <digit;counter++) {
                System.out.println("enter number of interger:");
            int  number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("the largest of the number is : " + largest);
        System.out.println("the smallest of the number is : " + smallest);
        }
}
