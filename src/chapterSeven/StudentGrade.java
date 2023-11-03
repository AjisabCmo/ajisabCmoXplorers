package chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("how many student do you have ");
        int student = scanner.nextInt();
        System.out.println("how many subject do they offer");
        int subject = scanner.nextInt();
        int [][] studentGrade = new int [student] [subject];




        for (int row = 0 ; row < studentGrade.length ; row++){
            for (int column = 0 ; column < studentGrade[row].length ; column++){
                System.out.printf("entering score for student%d,enter score for subject%d",row+1,column+1);
                int score = scanner.nextInt();
                studentGrade[row][column]=score;


            }

            System.out.printf("%n%n%n");
        }
        System.out.println("\nstudent ");
        for(int row = 0 ; row < studentGrade.length ; row++){



            System.out.printf("student%d\t", row +1);
            int total = 0;

            for (int column = 0 ; column < studentGrade[row].length ; column++){
                int score = studentGrade[row][column];
                total = total + score;
                System.out.print(score + "\t");



            }
            double average = (double ) total / studentGrade[row].length;

            System.out.println(total);
            System.out.println(average);

            System.out.println();
        }
        }
    }

