package chapterTwo;
import java.util.Scanner;

public class Mutilply {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int firstNumber = input.nextInt();

        System.out.println("Enter second integer:");
        int secondNumber = input.nextInt();

        int tripled = firstNumber *3;
        int doubleNumber = secondNumber *2;

     if ( tripled % doubleNumber==0){
         System.out.println(tripled +" is multiply of "+ doubleNumber);

     }else{
         System.out.println(tripled +" is not multiply of "+ doubleNumber);
     }
    }


}
