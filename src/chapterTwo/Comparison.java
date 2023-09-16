package chapterTwo;
import java.util.Scanner;
public class Comparison {





        public static void main(String[] args){

            Scanner input = new Scanner (System.in);

            System.out.print("Enter first integer : ");

            int number = input.nextInt();

            int square = number * number;
            int comparisons = 100;

            if (number > 100){
                System.out.printf("%d > %d%n", number, comparisons);
            }

            if (square > 100){
                System.out.printf("%d > %d%n", square,comparisons);


            }

            if (number == 100){
                System.out.printf("%d = %d%n", number, comparisons);

            }

            if (square == 100){
                System.out.printf("%d = %d%n", square, comparisons);


            }

            if (number != 100){
                System.out.printf("%d != %d%n", number, comparisons);

            }

            if (square != 100){
                System.out.printf("%d != %d%n", square, comparisons);

            }

            if (number < 100){
                System.out.printf("%d < %d%n", number, comparisons);
            }

            if (square < 100){
                System.out.printf("%d < %d%n", number, comparisons);
            }


        }


    }


