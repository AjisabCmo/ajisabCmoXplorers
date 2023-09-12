package chapterTwo;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest= 0,  number =0, integer=0;
        System.out.println("enter the number of integers:");//prompting the user for the number im going to use
         integer = scanner.nextInt();
        for (int counter=1; counter <=integer;counter++){
            System.out.println("enter the number:");//prompting the user for how many number they are entering
           number = scanner.nextInt();   //the variable im using to store the user input is number
            if(counter==1)
                smallest = number;
            else
                    if (number < smallest)
                        smallest = number;


        }
        System.out.printf("smallest integer is : %d%n",smallest);
    }
}
