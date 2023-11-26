package chapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {


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
             }

        }






      

   
