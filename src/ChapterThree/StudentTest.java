package ChapterThree;

import java.util.Scanner;

public class StudentTest{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Student student = new Student ();





        System.out.println("Name of school: ");
        String schoolName = input.nextLine();
        student.setSchoolName(schoolName );
        System.out.println();
        System.out.printf("the name of the school:%s%n%n", student.getSchoolName());










        System.out.println("Number of student:");
        int numberOfStudent= input.nextInt();
        student.setNumberOfStudent(numberOfStudent);
        System.out.println();
        System.out.printf("Number of student: %d%n%n", student.getNumberOfStudent ());






        System.out.println("Enter location:");
        input.nextLine();
        String location = input.nextLine();
        student.setLocation(location);
        System.out.println();
        System.out.printf("Enter Location: %s%n%n", student.getLocation());


    }
}
