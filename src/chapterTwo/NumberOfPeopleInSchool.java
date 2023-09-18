package chapterTwo;
import java.util.Scanner;
public class NumberOfPeopleInSchool {




        public static void main(String[] args){

            Scanner ismail = new Scanner(System.in);

            System .out.print("Enter the number of people in the school:");
            int numberOfStudentInSchool = ismail.nextInt();

            System.out.print("Enter the number of teacher in the school:");
            int numberOfTeacherInSchool = ismail.nextInt();

            System.out.print("Enter the number of Security in the school:");
            int numberOfSecurityInSchool = ismail.nextInt();

            int OverAllInSchool = numberOfStudentInSchool + numberOfTeacherInSchool + numberOfSecurityInSchool;

            System.out.printf("OverAllInSchool is %d%n", OverAllInSchool);

        }

    }

