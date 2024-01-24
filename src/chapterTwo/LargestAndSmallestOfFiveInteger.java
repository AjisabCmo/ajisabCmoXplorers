package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestOfFiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first integer:");
        int firstInteger = scanner.nextInt();
        System.out.println("enter first integer:");
        int secondInteger = scanner.nextInt();
        System.out.println("enter first integer:");
        int thirdInteger = scanner.nextInt();
        System.out.println("enter first integer:");
        int fourthInteger = scanner.nextInt();
        System.out.println("enter first integer:");
        int fifthInteger = scanner.nextInt();

        if(firstInteger > secondInteger && firstInteger > thirdInteger && firstInteger > fourthInteger && firstInteger > fifthInteger){
            System.out.println("the largest number is "+ firstInteger);
        }
        if(secondInteger > firstInteger && secondInteger > thirdInteger && secondInteger > fourthInteger && secondInteger > fifthInteger){
            System.out.println("the largest number is "+ secondInteger);
        }
        if(thirdInteger > firstInteger && thirdInteger > secondInteger && thirdInteger > fourthInteger && thirdInteger > fifthInteger){
            System.out.println("the largest number is "+ thirdInteger);
        }
        if(fourthInteger > firstInteger && fourthInteger > secondInteger && fourthInteger > thirdInteger && fourthInteger > fifthInteger){
            System.out.println("the largest number is "+ fourthInteger);
        }
        if(fifthInteger > firstInteger && fifthInteger > secondInteger && fifthInteger > thirdInteger && fifthInteger > fourthInteger){
            System.out.println("the largest number is "+ fifthInteger);
        }
        if(firstInteger < secondInteger && firstInteger < thirdInteger && firstInteger < fourthInteger && firstInteger < fifthInteger){
            System.out.println("the smallest number is "+ firstInteger);
        }
        if(secondInteger < firstInteger && secondInteger < thirdInteger && secondInteger < fourthInteger && secondInteger < fifthInteger){
            System.out.println("the smallest number is "+ secondInteger);
        }
        if(thirdInteger < firstInteger && thirdInteger < secondInteger && thirdInteger < fourthInteger && thirdInteger < fifthInteger){
            System.out.println("the smallest number is "+ thirdInteger);
        }
        if(fourthInteger < firstInteger && fourthInteger < secondInteger && fourthInteger < thirdInteger && fourthInteger < fifthInteger){
            System.out.println("the smallest number is "+ fourthInteger);
        }
        if(fifthInteger < firstInteger && fifthInteger < secondInteger && fifthInteger < thirdInteger && fifthInteger < fourthInteger){
            System.out.println("the smallest number is "+ fifthInteger);
        }
    }
}
