package chapterTwo;
import java.util.Scanner;
public class Velocity {



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the v0: ");
            double v0 = input.nextDouble();

            System.out.print("Enter the v1: ");
            double v1 = input.nextDouble();

            System.out.print("Enter the t: ");
            double t = input.nextDouble();

            double  startingVelocity = v0;
            double endingVelocity = v1;
            double time = t ;
            double acceleration = (startingVelocity-endingVelocity)/time;
            System.out.printf("acceleration is %f%n", acceleration);
        }

    }

