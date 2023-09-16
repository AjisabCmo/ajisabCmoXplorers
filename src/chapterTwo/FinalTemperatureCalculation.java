package chapterTwo;
import java.util.Scanner;
public class FinalTemperatureCalculation {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter amount of water in kilograms: ");
            double waterInKilograms = input.nextDouble();

            System.out.print("Enter initial Temperature: ");
            double initialTemperature = input.nextDouble();

            System.out.print("Enter final Temperature: ");
            double finalTemperature = input.nextDouble();

            double energy = waterInKilograms  * (finalTemperature - initialTemperature) * 4184;

            System.out.printf("energy is %f%n", energy);
        }
    }

