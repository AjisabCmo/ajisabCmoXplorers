package ChibuzorTask;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count=0;
        int result =0;
        while(count<10){
            System.out.println("enter score:");
            int number= scanner.nextInt();

            count++;

            result+=number;
        }
        double average =(double) result /10;
        System.out.println(" sum is :"+ result);
        System.out.println("the average is :"+average);

    }
}
