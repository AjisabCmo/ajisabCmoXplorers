package ChibuzorTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        int total=0;
        int count=0;

        for ( count=0; count<10;count++){
            System.out.println("Enter scores:");
           int score = scanner.nextInt();
            array[count ]=score;



        }


        for (int name=0;name< array.length;name++){
             total+=array[name];

        }




        double average = (double) total /array.length;
        System.out.println("the average is :" + average);
        System.out.println("the total is :" + total);

        int minimum=array[0];
        for (int name =0;name<array.length;name++) {
            if (array[name] < minimum) {
                minimum = array[name];
            }
        }
                System.out.println("the minimum is : " + minimum);

                int maximum=array[0];
                for (int name =0;name< array.length;name++) {
                    if (array[name] > maximum) {
                        maximum = array[name];
                    }
                }
                        System.out.println("the maximum is :" + maximum);


            }
        }




