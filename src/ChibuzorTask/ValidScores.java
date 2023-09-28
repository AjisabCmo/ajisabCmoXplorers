package ChibuzorTask;

import java.util.Scanner;

public class ValidScores {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       int sum=0;
       int counter=0;
        System.out.println("enter a score:");
        int number = scanner.nextInt();




        while ( counter < 10){
            System.out.println("enter score:");
            int  score= scanner.nextInt();
            if(score >= 0 && score <= 100)
                sum += score;
            counter++;


        }
        System.out.println("sum is :" + sum);
    }

}
