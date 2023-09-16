package ChapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int count=0;
        int number =0;
        int largest=0;

        while(count<10){
            System.out.println("enter number:");
            number= scanner.nextInt();
            count++;
            if (number>largest){
                largest=number;


            }

        }
        System.out.println("the largest number : "+largest);
    }
}
