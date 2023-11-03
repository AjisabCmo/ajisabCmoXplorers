package ChibuzorTask;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String buzz = " ";
        for (int count = 0 ; count < 10 ; count++){
            System.out.println("Enter the score:");
             int score = scanner.nextInt();
           String convert = String.valueOf(score);
            buzz = buzz + " " + convert;
             }
        System.out.println(buzz);
        }
    }

