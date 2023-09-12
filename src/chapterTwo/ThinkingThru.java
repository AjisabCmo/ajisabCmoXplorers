package chapterTwo;
import java.util.Scanner;

public class ThinkingThru {

    public static void main(String[] args){

        Scanner semicolon = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int firstNumber = semicolon.nextInt();

        System.out.println("Enter second integer:");
        int secondNumber = semicolon.nextInt();

        int digit = firstNumber;
        int digit1 = secondNumber;

        int sum = digit + digit1;
        int divide = digit / digit1;
        int diff = digit - digit1;

        System.out.printf("sum is : %d%n", sum);
        System.out.printf("divide is : %d%n", divide);
        System.out.printf("diff is :%d%n", diff);



    }
}
