package chapterTwo;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
   // public static void calculating(){
        Scanner scanner = new Scanner(System.in);



            System.out.println("enter the days of the week from 0 to 6:");

            int day = scanner.nextInt();

            while(day>6) {
                System.out.println("enter the days of the week from 0 to 6:");
                day = scanner.nextInt();
            }
            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                    //default:
                      //  calculating();
                }
            }

    //public static void main(String[] args) {
     //   calculating();
    }
        //}

