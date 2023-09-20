package ChapterFour;

import java.util.Scanner;

public class MyOwnHotClassCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of a factor");
         int number = scanner.nextInt();
            int digit =0;
         for (int count = 1;count<=number; count++){
            if (number%count==0){
                //System.out.printf(" %d ", count);
                 digit++;
             }
             }
        System.out.println(digit++);
         }





}
