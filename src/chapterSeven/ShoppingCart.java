package chapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

private static Integer discountInput;
        private String name;
        private String productName;

        private double price;
        private int quantity;

        private String cashierName;
        private double subtotal;



        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                    boolean moreItem = true;
                System.out.println("enter the customer's name");
                String name = scanner.next();





                while (moreItem){
                        System.out.println("what did the user buy");
                        String userBuy = scanner.next();

                        System.out.println("how many pieces");
                        int quatity = scanner.nextInt();

                        System.out.println("how much per unit");
                        double price = scanner.nextDouble();
                        System.out.print("Do you want to continue buying items? (Yes/No): ");
                        String  userInput = scanner.next();
                        if (userInput.equalsIgnoreCase("no"))moreItem = false;

                }





                System.out.println("cashier name");
                name = scanner.next();
                System.out.println("\nHow much discount will the customer get \n don't give more than 10% discount");
                String discount = scanner.nextLine();
             int num = Integer.parseInt(discount);
                 discountInput = num;
                if (discount.matches("^\\d+$*")&&  num <= 10){
                        StoreInfo();

                }
             }

        private static void StoreInfo() {
        }

}






      

   
