package chapterTwo;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int largest= 0,  number =0, integer =0;
            System.out.println("enter the number of integers:");
             integer = scanner.nextInt();
            for (int count=1; count <=integer;count++){
                System.out.println("enter interger:");
                number = scanner.nextInt();   //the variable im using to store the user input is number
                if(count==1)
                    largest = number;
                else
                if (number >largest)
                    largest = number;


            }
            System.out.printf("largest integer is : %d%n",largest);
        }

}
