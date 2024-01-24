package chapterTwo;

import java.util.Scanner;

public class ChapterTwoPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber= scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter fourth number: ");
        int fouthNumber = scanner.nextInt();
        System.out.println("Enter fiveth number: ");
        int fivethNumber = scanner.nextInt();

             int positive = 0; int negative = 0; int Zero = 0;

             if (firstNumber>0) {
                 positive++;
             }else if(firstNumber<0){
                 negative++;
             }else {
                 Zero++;
             }

        if (secondNumber>0) {
            positive++;
        }else if(secondNumber<0){
            negative++;
        }else {
            Zero++;
        }

        if (thirdNumber>0) {
            positive++;
        }else if(thirdNumber<0){
            negative++;
        }else {
            Zero++;
        }

        if (fouthNumber>0) {
            positive++;
        }else if(fouthNumber<0){
            negative++;
        }else {
            Zero++;
        }

        if (fivethNumber>0) {
            positive++;
        }else if(fivethNumber<0){
            negative++;
        }else {
            Zero++;
        }

        System.out.print("count of postive:" + positive + "\n" +"count of negative: " + negative +" \n"+"count of zero: " + Zero);


    }
}
