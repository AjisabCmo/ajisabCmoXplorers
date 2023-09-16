package chapterTwo;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int Positive = 0;int Negative = 0;int Zero=0;
//
//
//        System.out.print("enter the  numbers you want  :");
//        int digit = scanner.nextInt();
//
//        System.out.println("Enter "+digit +" number:");
//        for (int index=0; index<digit;index++) {
//            int number = scanner.nextInt();
//
//            if (number > 0) {
//                Positive++;
//            } else if (number < 0) {
//                Negative++;
//            } else {
//                Zero++;
//            }
//        }
//           // System.out.println("count of postive:" + Positive);
//          //  System.out.println("count of negative:" + Negative);
//         //   System.out.println("count of zero:" + Zero);
//        System.out.print("count of postive:" + Positive + "\n" +"count of negative: " + Negative +" \n"+"count of zero: " + Zero);
//
int numer = 8;
for (int i = 1; i<8; i++){
    for (int col = 1; col<i; col++){
        System.out.print(col + " ");
    }
    System.out.println(" ");
}
    }
}


