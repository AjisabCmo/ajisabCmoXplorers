package chapterTwo;
import java.util.Scanner;
public class LengthAndArea {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter v :");
            double v = input.nextDouble();
            System.out.print("Enter a:");
            double a = input.nextDouble();
            double length = (v * v);
            double area2 = 2 * a;
            double result = length / area2;
            System.out.printf("length is %f%n", result);
        }
}
