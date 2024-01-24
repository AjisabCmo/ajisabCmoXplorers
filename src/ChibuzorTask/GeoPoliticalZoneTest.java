package ChibuzorTask;

import java.util.Scanner;

import static ChibuzorTask.GeoPoliticalZone.*;

public class GeoPoliticalZoneTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("which geo political zone do you belong to:");
//        String zone = scanner.nextLine();

GeoPoliticalZoneTest zone = new GeoPoliticalZoneTest();
zone.states();

    }

    private void states() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the state: ");
        String word = input.next();
        if (word.matches("^\\D+$*")) {
            GeoPoliticalZone isPolitical = geopolitical(word);
            if (isPolitical == NORTHCENTRAL) {
                System.out.println("NORTH CENTRAL");
            }
            else if (isPolitical ==  NORTHEAST) {
                System.out.println(" NORTH EAST");
            }
            else if (isPolitical ==  NORTHWEST) {
                System.out.println("NORTH WEST");
            }
            else if (isPolitical ==   SOUTHWEST) {
                System.out.println(" SOUTH WEST");
            }
            else if (isPolitical ==   SOUTHEAST) {
                System.out.println(" SOUTH EAST");
            }
            else if (isPolitical ==   SOUTHSOUTH) {
                System.out.println("SOUTH SOUTH");
            }
            else {
                System.out.println("Not a state");
                states();
            }


        }

    }


}

