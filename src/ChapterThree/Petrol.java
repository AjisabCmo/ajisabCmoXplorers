package ChapterThree;

import ChapterThree.PetrolPurchase;

import java.util.Scanner;

public class Petrol{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PetrolPurchase ismailPetrol= new PetrolPurchase("osi kwara", "diesel fuel",100, 85.0,15.0);

        System.out.println("name of stationLocation:");
        String stationLocation = scanner.nextLine();
        ismailPetrol.setStationLocation(stationLocation);
        System.out.printf("stationLocation:%s%n" , ismailPetrol.getStationLocation());
        System.out.printf("typeOfPetrol:%s%n", ismailPetrol.getTypeOfPetrol());
        System.out.printf("quantityOfPurchaseInLiter:%d%n" , ismailPetrol.getQuantityOfPurchaseInLiter());
        System.out.printf("pricePerLiter:%f%n" , ismailPetrol.getPricePerLiter());
        System.out.printf("percentageDiscount:%f%n" , ismailPetrol.getPercentageDiscount());
        System.out.printf("netAmount:%f%n" ,ismailPetrol.getPurchaseAmount());

    }
}








