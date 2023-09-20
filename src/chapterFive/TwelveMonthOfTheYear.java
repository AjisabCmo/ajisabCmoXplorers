package chapterTwo;

import java.util.Scanner;

public class TwelveMonthOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Enter the month of the year from 1 to 12.");

            int MonthInput = scanner.nextInt();
            switch (MonthInput) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Febraury");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("Noverember");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("you have enter a wrong input");
            }


        }

    }
}
