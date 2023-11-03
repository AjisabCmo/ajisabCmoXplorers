package MyOwnExercise;

import java.util.Scanner;

public class EarlyMomoLearningArray {
    public static void main(String[] args) {
//        int [][]a = new int[2][];
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("enter the size of array:");
//        int size = scanner.nextInt();
//        System.out.printf("enter element of array : ");
//
//        for(int count = 0 ; count < size ; count ++){
        Scanner scanner = new Scanner(System.in);
//
//        int total = 0;
//        int gradeCounter = 0;
//        System.out.println("enter grade");
//        int grade = scanner.nextInt();
//
//        while (grade != -1) {
////        for (count = 1; count != -1; count++) {
//
//            total = total + grade;
//            gradeCounter=gradeCounter+1;
//
//            System.out.println(" enter the number : ");
//            grade = scanner.nextInt();
//
//
//        }
//
//        if (gradeCounter != 0) {
//
//
//            double average = (double) total / gradeCounter;
//            //
////    }
////    int average = total /10;
//            System.out.printf("%nTotal grade of %d student %d%n", gradeCounter, total);
//            System.out.printf("the average is %.2f%n ", average);
//        }
        int total = 0;
        for (int i = 2; i <=20 ; i+=2) {
            System.out.println(i);
            total +=i;


        }
        System.out.println("the total is " + total);


    }

    }

//}
