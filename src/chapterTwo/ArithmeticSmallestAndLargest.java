package chapterTwo;
import java.util.Scanner;
public class ArithmeticSmallestAndLargest {



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer: ");
            int number1 = input.nextInt();

            System.out.print("Enter second integer: ");
            int number2 = input.nextInt();

            System.out.print("Enter third integer: ");
            int number3 = input.nextInt();

            int sum = number1 + number2 + number3;
            int average = sum /3;
            int product = number1 * number2 * number3;

            System.out.printf("sum is %d%n", sum);
            System.out.printf("average is %d%n", average);
            System.out.printf("product is %d%n", product);

            if (number1 < number2 && number1 < number3){
                System.out.printf("Smallest number is %d%n", number1);
            }

            if (number2 < number1 && number2 < number3){
                System.out.printf("Smallest number is %d%n", number2);
            }

            if (number3 < number1 && number3 < number2){
                System.out.printf("Smallest number is %d%n", number3);
            }

            if (number1 > number2 && number1 > number3){
                System.out.printf("Largest number is %d%n", number1);
            }

            if (number2 > number1 && number2 > number3){
                System.out.printf("Largest number is %d%n", number2);
            }

            if (number3 > number1 && number3 > number2){
                System.out.printf("Largest number is %d%n", number3);
            }

        }
    }

