package ChapterThree;

import java.util.Scanner;

public class TargetHeartRateCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter firstName: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter lastName: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter age:");
        int age = scanner.nextInt();

        HeartRate person = new HeartRate (firstName,lastName,age);

        System.out.printf("calculations for %s %s age %d%n",person.getFirstName(),person.getLastName(),person.getAge());

        System.out.printf("Maximum heart rate : %d\n beat per minute ",person.getMaximumHeartRate());

        System.out.print("Target heart rate range:");
        person.setTargetHeartRateRange();
        System.out.println();

    }
}
