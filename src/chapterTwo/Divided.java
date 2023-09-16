package chapterTwo;
import java.util.Scanner;
public class Divided {



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            int  integer = number;
            int divide = (integer) % 3;


            if (number%3==0){
                System.out.printf("the divide is %d%n", divide);
            }

            if (number%3!=0){

                System.out.printf("the divide is not  %d%n", divide);


            }

        }

    }

