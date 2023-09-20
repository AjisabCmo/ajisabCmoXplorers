package ChapterFour;

import java.util.Scanner;

public class SumOfFirstTenNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number:");
     int number=scanner.nextInt();
        //initialize variable to store the sum
     int sum = 0;

// loop through the first 10 natural number
        for (int count =1;count<=number;count++) {
            sum =sum+count;


        }
        //print sum
        System.out.println("sum of the first 10 natural number is =" + sum);
    }
}
