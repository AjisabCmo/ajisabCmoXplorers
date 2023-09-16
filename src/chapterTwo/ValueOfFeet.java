package chapterTwo;
import java.util.Scanner;
public class ValueOfFeet {



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a value for feet: ");
            double feet = input.nextDouble();
            double meter = 0.305;
            double result = feet * meter;
            System.out.println(result);
        }
    }
}
