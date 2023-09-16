package chapterTwo;
import java.util.Scanner;
public class Bmi {



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter weight in pounds: ");
            double weight = input.nextDouble();

            System.out.print("Enter height in inches: ");
            double height = input.nextDouble();

            double weightInPounds = weight * 703;
            double heightInInches = height * 0.0254;
            double squareOfHeightInInches= heightInInches * heightInInches;
            double bmi = weightInPounds / squareOfHeightInInches;

            System.out.printf("BMI is %f%n", bmi);
        }
    }

