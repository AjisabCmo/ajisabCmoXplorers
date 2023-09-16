package chapterTwo;
import java.util.Scanner;

public class Billion {


        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of minutes: ");
            int minutes = input.nextInt();
            int numberOfMinute = 5256000;
            int numberOfYears = minutes/numberOfMinute;
            System.out.printf("%d minutes is approximately %d years %n", minutes, numberOfYears);

        }
    }

