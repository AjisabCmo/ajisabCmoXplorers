package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Uber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = new int[10];
        for (int count = 1; count <= 10; count++) {
            System.out.println("enter a score:");
            int score = scanner.nextInt();
           array[count-1]=score;

        }
        System.out.println(Arrays.toString(array));
        int largest =array[0];
        for (int count = 0; count < array.length; count++) {
            if (array[count] > largest) {
                largest = array[count];
            }

        }
        System.out.println("The largest number is :" + largest);

//        int largest =array[0];
//        for (int i=0;i<10;i++) {
//            System.out.println("enter a score:");
//            array[i] = scanner.nextInt();
//
//
//            if (array[i] > largest){
//                largest =array[i];
//            }
//
//        }
//        System.out.println(largest);
    }

}