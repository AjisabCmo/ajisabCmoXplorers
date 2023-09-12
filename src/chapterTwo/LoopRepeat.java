package chapterTwo;

import java.util.Scanner;

public class LoopRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum;

        boolean output = true ;

        do  {

            System.out.println("enter number:");
            int number = scanner.nextInt();
            System.out.println("enter number:");
            int number2= scanner.nextInt();

          sum = number + number2;
            System.out.println(sum);
            scanner.nextLine();
            System.out.println("so you want to perform the operation again? yes or no");
             String user=scanner.nextLine();
            if (user.equals("no")) {
               // user.equals("no");
                //user.equals("no");
                output = false;

            }
        }

        while (output);
    }
}
