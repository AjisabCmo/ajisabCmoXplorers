package ChapterFour;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner semicolon=new Scanner(System.in);

        System.out.println("enter a number:");
        int number = semicolon.nextInt();

        if (number < 1 || number > 10){
            System.out.println("error input :");
        }else{


        int count=1;
        int digit=1;
        for (count=1;count<=number;count++){
            for (digit=1;digit<=count;digit++){
                System.out.print(" "+" *");
            }
            System.out.println();
        }
        }

    }
}
