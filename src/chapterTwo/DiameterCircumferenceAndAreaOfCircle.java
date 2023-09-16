package chapterTwo;
import java.util.Scanner;
public class DiameterCircumferenceAndAreaOfCircle {
    public static void main(String[] args){

        Scanner semicolon = new Scanner(System.in);

        System.out.print("Enter the the radius of a circle:");
        int radius = semicolon.nextInt();

        int diameter = 2 * radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159 * radius * radius ;


        System.out.printf("diameter : %d%n, circumference : %f%n , area is : %f%n", diameter, circumference, area);

    }



}

