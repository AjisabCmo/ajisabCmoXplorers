package chapterTwo;
import java.util.Scanner;

public class SquareOfNumber {

    public static void main(String[] args){

        Scanner semicolon = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = semicolon.nextInt();

        int squareOfNumber = number * number;

        System.out.println("The square of "+number+"  is:" + squareOfNumber);
    }
}
