package ChapterFour;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account Number: ");
        int accountNumber = scanner.nextInt();
        while (accountNumber != -1) {

            System.out.print("Enter balance at the beginning of the month: ");
            int balanceAtTheBeginningOfTheMonth = scanner.nextInt();
            System.out.print("Enter total of all items charged by the customer this month: ");
            int totalOfAllItemsChargedByTheCustomerThisMonth = scanner.nextInt();
            System.out.print("Enter total of all credits applied to the customer’s account this month");
            int totalOfAllCreditsAppliedToTheCustomerAccountThisMonth = scanner.nextInt();
            System.out.print("Enter allowed credit limit.");
            int allowedCreditLimit = scanner.nextInt();

            int newBalance = balanceAtTheBeginningOfTheMonth + totalOfAllItemsChargedByTheCustomerThisMonth - totalOfAllCreditsAppliedToTheCustomerAccountThisMonth;

            if (newBalance > allowedCreditLimit) {
                System.out.println("your credit limit has exceed");

            } else {
                System.out.println("im okay");
                System.out.print("Enter your account Number(or -1 to end): ");
                accountNumber= scanner.nextInt();

            }
        }
    }
}
