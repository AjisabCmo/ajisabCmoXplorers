package ChibuzorTask;

import java.util.Scanner;

public class SumOfAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=0;
        int result=0;
        int evenNumber=0;
        int even = 0;
        while(count<10){
            System.out.println("enter score:");
            int number = scanner.nextInt();
            count++;
            result+=number;
            if (number%2==0){
                evenNumber +=result;
                even++;
            }

        }
        double average =(double) evenNumber/ even;
        System.out.println("the average even number:"+average);
    }
}
