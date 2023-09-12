package chapterTwo;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter factorial value number you want :");
        int number = scanner.nextInt();

        int value =1;
        int digits;

        for (digits=1;digits <= number ;digits++){
            value =value *digits;
        }
        System.out.println("factorial of "+number+" is : " + value);

    }
}
