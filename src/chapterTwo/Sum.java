package chapterTwo;
import java.util.Scanner;
public class Sum {




        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer:");

            int figure1 = input.nextInt();

            System.out.print("Enter second integer:");

            int figure2 = input.nextInt();

            System.out.print("Enter third integer:");

            int figure3 = input.nextInt();


            int sum = figure1 + figure2 + figure3;

            System.out.printf("sum is %d%n", sum);

        }
    }

