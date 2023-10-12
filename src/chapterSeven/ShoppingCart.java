package chapterSeven;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

    }



         String name;
         String userBuy;

         int pieces;

         double perUnit;

         String addMoreItems;

         String cashierName;



        Scanner scanner = new Scanner(System.in);

    String keepShopping = "y";
    ShoppingCart cart1 = new ShoppingCart();



      {
        System.out.print ("Enter the name of the customer: ");
        name = scanner.next();

        System.out.print ("Enter what user buy: ");
        userBuy = scanner.next();

        System.out.print ("Enter the pieces: ");
        pieces = scanner.nextInt();

        System.out.print("Enter the price per unit: ");
        perUnit = scanner.nextDouble();
        System.out.print("Enter add more items: ");
        addMoreItems= scanner.nextLine();
        System.out.print("Enter the cashier name :");
        cashierName= scanner.nextLine();

        cart1.addToCart(name, userBuy, pieces,perUnit,addMoreItems,cashierName);
        System.out.println(cart1);
        System.out.print ("Continue shopping (y/n)? ");
        keepShopping = scanner.next();

    }

    private void addToCart(String name, String userBuy, int pieces, double perUnit, String addMoreItems, String cashierName) {
    }




    }
