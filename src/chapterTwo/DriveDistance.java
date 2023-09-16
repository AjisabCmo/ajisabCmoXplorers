package chapterTwo;
import java.util.Scanner;
public class DriveDistance {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the driveDistance: ");
            double driveDistance = input.nextDouble();

            System.out.print("Enter the milesPerGallon: ");
            double milesPerGallon = input.nextDouble();

            System.out.print("Enter the pricePerGallon: ");
            double pricePerGallon = input.nextDouble();


            double costOfDriving = (driveDistance / milesPerGallon) * pricePerGallon;
            System.out.printf("costOfDriving is %f%n", costOfDriving);
        }
    }

