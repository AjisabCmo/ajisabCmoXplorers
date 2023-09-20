package ChapterFour;

import java.util.Scanner;

public class MyFirstNightLooping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a numner:");
       int  number = scanner.nextInt();

       while (number>=10){
           System.out.println("Greater");
           number--;
       }
    }
}
