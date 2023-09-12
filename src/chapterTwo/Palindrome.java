package chapterTwo;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner semicolon = new Scanner(System.in);

        System.out.println("Enter three integer:");
        int number = semicolon.nextInt();

        int digit = number / 100;
        int digit2 = number / 10 % 10;
        int digit3 = number % 10;

        if (digit == digit3) {
            System.out.println("it is a palindrome");
        }
        if (digit != digit3) {
            System.out.println("it is not palindrome");
        }
    }
}