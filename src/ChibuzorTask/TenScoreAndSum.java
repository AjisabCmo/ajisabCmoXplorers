package ChibuzorTask;

import java.util.Scanner;

public class TenScoreAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int result =0;
        while(count <10){
            System.out.println("Enter a score:");
            int number = scanner.nextInt();
            count++;
            result+=number;

        }
        System.out.println("sum is:"+ result);
    }
}
