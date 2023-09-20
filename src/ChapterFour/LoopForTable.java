package ChapterFour;

import java.util.Scanner;

public class LoopForTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter multiplication number:");
        int number = scanner.nextInt();

        for (int count=1;count<=12;count++){
            System.out.println(number + " * " +count+ " = " + (number *count));
        }
    }
}
//multiplication table