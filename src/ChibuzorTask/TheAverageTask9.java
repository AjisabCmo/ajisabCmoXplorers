package ChibuzorTask;

import java.util.Scanner;

public class TheAverageTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int count =0;
        for (count =0;count<10;count++){
            System.out.println("enter score:");
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100){
               sum +=score;
            }

        }
        double average = (double )sum/count;
        System.out.println("the average of the valid score is :" + average);
    }
}
