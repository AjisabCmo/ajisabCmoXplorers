package chapterTwo;

import java.util.Scanner;

public class MyNightSnacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number from 1 to 100:");
        int number = scanner.nextInt();

        if (number >=1 && number < 30){
            System.out.println("low level");
        }
        else if ( number <50){
            System.out.println("average level");
        }
        else if ( number <80){
            System.out.println("high level");
        }
          else if ( number <=100){
              System.out.println("a - level");
          }else {
              System.out.println("no score");
          }

        }
        }

// input number from 1 to 100
// "low level" less than 1-30
//"average level" less than 50
//"high level" less than 80
//"a-level"less than or equals 100
