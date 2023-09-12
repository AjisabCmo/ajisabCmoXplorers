package chapterTwo;

import java.util.Scanner;

public class CertainValue {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a value:");
        int value = scanner.nextInt();
        int result = value % 10;
        int answer = result + value;
        System.out.println(answer);


    }
}
