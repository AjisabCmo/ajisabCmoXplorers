package chapterTwo;
import java.util.Scanner;
public class TakeHomeCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a number:");
        int secondNumber = scanner.nextInt();

        //int count=0;
        int numberRaiseToPower=1;
       for(int count=0;count<secondNumber;count++){
           numberRaiseToPower =firstNumber * numberRaiseToPower;

       }

       System.out.println(numberRaiseToPower);
    }

}
