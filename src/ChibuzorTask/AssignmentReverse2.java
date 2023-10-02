package ChibuzorTask;

import java.util.Scanner;

public class AssignmentReverse2 {


    public static int reverse() {


        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        int number = 0;
        int count;
        for (count = 0; count < array.length; count++) {

            System.out.println("enter number");
            number = scanner.nextInt();
            array[count] = number;

        }
        System.out.println("Original Array:");
        for (int cmo = 0; cmo < array.length; cmo++)
            System.out.print(array[cmo] + "  ");

        System.out.println();

        //print array starting from last element

//        int[] result = new int[array.length];
//          for(int index=0;index>= array.length;index++){
//              result[array.length-1-index] = array[index];
//
//          }


        System.out.println("Original Array printed in reverse order:");
        for (int cmo = array.length - 1; cmo >= 0; cmo--)
            System.out.print(array[cmo] + "  ");
        return reverse();
    }

    public static void main(String[] args) {


        int result =reverse();
        System.out.println(result);
    }
}
