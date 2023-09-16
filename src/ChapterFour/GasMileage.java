package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int miles = 0;
        int gallons = 0;
        double milePerGallon = 0.0;
        int totalMiles = 0;
        int totalGallons = 0;
        double totalMilePerGallon = 0.0;
        int trips = 0;

        System.out.print("enter trip 1 mile (as integer) or -1 to quit: ");
        miles = scanner.nextInt();
        if (miles != -1) {
            System.out.print("Enter trip 1 gallons(as integer: )");
            gallons = scanner.nextInt();
            trips++;
        }
        while (miles != -1) {
            totalMiles += miles;
            totalGallons += gallons;
            milePerGallon = miles / gallons;
            totalMilePerGallon = totalMiles / totalGallons;

            System.out.printf("trips %d's milePerGallon is %.1f\n", trips, milePerGallon);

            if (trips > 1) {
                System.out.printf("\n total miles of your %d trips is %d\n", trips, totalMiles);
                System.out.printf("total gallons of your %d trips is %d\n", trips, totalGallons);
                System.out.printf(" combine milePerGallon if your %d trips is %.1f\n", trips, totalMilePerGallon);
            }
            trips++;
            System.out.printf("\n enter trip %d mile (as integer) or -1 to quit:", trips);
            miles = scanner.nextInt();
            if (miles != -1) {
                System.out.printf("enter trip %d gallon (as integer)", trips);
                gallons = scanner.nextInt();
            }
        }
        if (totalMiles != 0) {
            System.out.printf("\n total mile driven is :%d\n", totalMiles);
            System.out.printf(" total gallon used is :%d\n", totalGallons);
            System.out.printf(" combine milePerGallon is : %.1f\n\n", totalMilePerGallon);

        } else
            System.out.printf("no trip information enter .\n\n");
    }

}