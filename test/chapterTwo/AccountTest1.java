package chapterTwo;
import java.util.Scanner;
public class AccountTest1 {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Account1 ismailAccount = new Account1();

        System.out.println("Enter the amount of money you want to deposit :");
        int balance = input.nextInt();
        ismailAccount.deposit(balance);
     System.out.printf("amount of money deposited is :%n%d%n", ismailAccount.checkBalance());



      System.out.println("Enter the amount of money you want to withdraw:");
      int balance1 =input.nextInt();
       ismailAccount.withdraw(balance1);
       System.out.printf("The remaining amount is :%n%d%n",ismailAccount.checkBalance());



    }
}
