package chapterTwo;
import java.util.Scanner;
public class ComputeAverage {

    public static void main(String[] args){

        Scanner semicolon = new Scanner(System.in);

        System.out.print("Enter three number:");
        double number1= semicolon.nextDouble();
        double number2 = semicolon.nextDouble();
        double number3= semicolon.nextDouble();

        double average = (number1 + number2 + number3 )/3;
        System.out.println("the average is " +number1 + " " +number2+ " " + number3 +" is " + average);
    }

}
