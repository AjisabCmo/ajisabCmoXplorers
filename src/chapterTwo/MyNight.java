package chapterTwo;

import java.util.Scanner;

public class MyNight {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        int number= scanner.nextInt();



        if (number!=0 && number%5==0){
            System.out.println("the number is divided by 5 is a factor");


        }else {

            System.out.println("the number is not a factor");
        }

        }


    }

