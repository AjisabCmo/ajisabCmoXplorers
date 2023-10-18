package chapterSeven;

import java.util.Scanner;

public class CustomerAndItemArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] customer = new int[4][3];
        for (int row  = 0; row  < customer.length; row ++) {
            for (int column = 0; column < customer[row].length ; column++) {
                System.out.printf("Enter customer%d,item%d ",row+1,column+1);
                int itemNumber = scanner.nextInt();
                customer[row][column]=itemNumber;
            }

        }


//        System.out.println("Enter Price Of Customer1,Item1 : ");
//        int customerItem1 = scanner.nextInt();
//        System.out.println("Enter Price Of Customer1,Item2 : ");
//        int customerItem2 = scanner.nextInt();
//        System.out.println("Enter Price Of Customer1,Item3 : ");
//        int customerItem3 = scanner.nextInt();
//        int [][] customer = new int[4][3];
//        customer[0][0] = customerItem1;
//        customer[0][1] = customerItem2;
//        customer[0][2] = customerItem3;
//        System.out.println("Enter price of customer2, item1");
//        int customer2Item1 = scanner.nextInt();
//        System.out.println("Enter price of customer2, item2");
//        int customer2Item2 = scanner.nextInt();
//        System.out.println("Enter price of customer2, item3");
//        int customer2Item3 = scanner.nextInt();
//        customer[1][0] = customer2Item1;
//        customer[1][1] = customer2Item2;
//        customer[1][2] = customer2Item3;
//        System.out.println("Enter price of customer3,item1 : ");
//        int customer3Item1 = scanner.nextInt();
//        System.out.println("Enter price of customer3,item2 : ");
//        int customer3Item2 = scanner.nextInt();
//        System.out.println("Enter price of customer3,item3 : ");
//        int customer3Item3 = scanner.nextInt();
//        customer[2][0] = customer3Item1;
//        customer[2][1] = customer3Item2;
//        customer[2][2] = customer3Item3;
//        System.out.println("Enter price of customer4,item1 : ");
//        int customer4Item1 = scanner.nextInt();
//        System.out.println("Enter price of customer4,item2 : ");
//        int customer4Item2 = scanner.nextInt();
//        System.out.println("Enter price of customer4,item3 : ");
//        int customer4Item3 = scanner.nextInt();
//        customer[3][0] = customer4Item1;
//        customer[3][1] = customer4Item2;
//        customer[3][2] = customer4Item3;

        System.out.print( "      \t\titem1  " + "   \titem2  " + " \titem3");
        for (int row = 0; row <customer.length ; row++) {
            System.out.println();

            System.out.printf("customer%d\t", row +1);

            for (int column = 0; column < customer[row].length; column++) {


                System.out.print(customer[row][column] + " \t\t ");


            }

            System.out.println();
        }

    }
}
