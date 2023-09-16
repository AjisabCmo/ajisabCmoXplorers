package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int som= scanner.nextInt();
        int big = scanner.nextInt();
        int num = scanner.nextInt();

        int smallest=som;
        if (big<smallest){
           smallest = big;
        }
        if (num < smallest){
            smallest = num;
        }

        int largest = som;
        if (big>largest){
            largest=big;
        }
        if (num>largest){
            largest=num;

        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
