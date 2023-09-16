package chapterTwo;
import java.util.Scanner;
public class Digits {


        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number: ");

            int number = input.nextInt();


            int lastDigits = number / 100;
            int secondDigits = number % 100;
            int FirstDigits = number / 100 % 10;

            int sum = lastDigits + secondDigits + FirstDigits;

            System.out.printf("The sum of the digits is %d%n", sum);

        }
    }

