package chapterTwo;
import java.util.Scanner;
public class Arithmetic {


        public static void main(String[] args){

            Scanner input = new Scanner (System.in);

            System.out.print("Enter first integer: ");

            int number1 = input.nextInt();

            System.out.print("Enter second integer: ");

            int number2 = input.nextInt();

            int square = number1 * number1;
            int square2 = number2 * number2;
            int sum = square + square2;
            int Different = square - square2;

            System.out.printf("%n%d * %d = %d%n", number1, number1, square);
            System.out.printf("%n%d * %d = %d%n", number2, number2, square2);
            System.out.printf("%nsum = %d + %d =  %d%n", square , square2, sum);
            System.out.printf("%nDifferent = %d  - %d = %d%n", square, square2, Different);
        }
    }

