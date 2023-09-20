package chapterFive;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of days in  week from 0 to 6");

        int number = scanner.nextInt();

        System.out.println("Enter the number of days elapsed :");
        int futureDate = scanner.nextInt();

        int result= (number + futureDate) % 7;

        switch(number){
            case 0:
                System.out.print("Today is sunday");
                break;
            case 1:
                System.out.print("Today is Monday");
                break;
            case 2:
                System.out.print("Today is Tuesday");
                break;
            case 3:
                System.out.print("Today is Wednesday");
                break;
            case 4:
                System.out.print("Today is Thursday");
                break;
            case 5:
                System.out.print("Today is Friday");
                break;
            case 6:
                System.out.print("Today is Saturday");
                break;

        }


        switch (result){
            case 0:
                System.out.println(" and The future day is sunday");
                break;
            case 1:
                System.out.println(" and The future day is Monday");
                break;
            case 2:
                System.out.println(" and The future day is Tuesday");
                break;
            case 3:
                System.out.println(" and The future day is Wednesday");
                break;
            case 4:
                System.out.println(" and The future day is Thursday");
                break;
            case 5:
                System.out.println(" and The future day is Friday");
                break;
            case 6:
                System.out.println(" and The future day is Saturday");
                break;
        }
    }
}
