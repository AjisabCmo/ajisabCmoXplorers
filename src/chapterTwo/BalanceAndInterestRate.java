package chapterTwo;
 import java.util.Scanner;
public class BalanceAndInterestRate {



        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter balance: ");
            double balance = input.nextDouble();
            System.out.print("Enter interestRate: ");
            double interestRate = input.nextDouble();
            double interest =  balance * (interestRate/1200);
            System.out.printf("interest is %f%n", interest);
        }
    }
