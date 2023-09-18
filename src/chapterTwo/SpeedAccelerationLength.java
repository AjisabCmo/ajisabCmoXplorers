package chapterTwo;
import java.util.Scanner;
public class SpeedAccelerationLength {


        public static void main(String[] args){

            Scanner input = new Scanner (System.in);

            System.out.print("Enter first integer: ");

            int  v1 = input.nextInt();

            System.out.print("Enter second integer: ");
            int v2 = input.nextInt();

            int speed = v1 * v2 ;
            double acceleration = 2 * 3.5;
            double lenght = speed / acceleration ;

            System.out.printf("speed is %d%n", speed);
           System.out.printf("acceleration is %d%n", acceleration);
            System.out.printf("lenght is %d%n", lenght);
        }
    }

