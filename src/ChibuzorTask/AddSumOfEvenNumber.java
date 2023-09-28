package ChibuzorTask;

import java.util.Scanner;

public class AddSumOfEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=0;
        int evenNumber=0;
        while(count<10){
            System.out.println("enter score:");
            int number = scanner.nextInt();
            count++;
            if (number%2==0){
                evenNumber += number;
            }

        }
        System.out.println("the even number:"+evenNumber);
    }
}
