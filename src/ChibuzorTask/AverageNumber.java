package ChibuzorTask;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        double result =0;

        while (count<10){
            System.out.println("Enter score:");
            int number = scanner.nextInt();
            count++;
            result+=number;

        }
        double average = (double)result/ count;
        System.out.println("The Average is:"+average);
    }
}
