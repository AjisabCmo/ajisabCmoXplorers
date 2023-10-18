package chapterSeven;

import java.util.Scanner;

public class CardValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello ,kindly Enter Card Details To Verify");
        String cardNumber = scanner.nextLine();


        System.out.printf("Credit Card Type %s%n",validateCardType(cardNumber));
        System.out.printf("Credit Card Number %s%n",collectInput(cardNumber));
        System.out.printf("Credit Card Digit Length %d%n", validateCardLength(cardNumber));
        System.out.printf("Credit Card Type %s%n",addNumber(validate(cardNumber), newValidate(cardNumber)));
        validate(cardNumber);
        newValidate(cardNumber);
    }

    public static String collectInput(String cardNumber){
        return cardNumber;
    }
    public static int validateCardLength(String cardNUmber) {
            return cardNUmber.length();
    }

    public static String validateCardType(String cardNUmber) {
        char nums;
        nums = cardNUmber.charAt(0);
        if (nums == '4') {
            return "Visa Card";
        }
        if (nums == '5') {
            return "Master Card";
        }
        if (cardNUmber.charAt(0)=='3' && cardNUmber.charAt(1) =='7') {
            return "American Express Card";
        }
        if (nums == '6') {
            return "Discover Card";
        }

        return "Invalid Card";
    }


    public static int validate(String cardNumber) {
        int[] number = new int[cardNumber.length()];
        int count = 0;
        for (int i = 0; i < cardNumber.length(); i++) {
            number[count] = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
            count++;
        }
        int counter = 0;
        for (int index = number.length - 2; index >= 0; index -= 2) {//skip the number by one from the back
            counter++;
//            System.out.println(number[index]);
        }
         int[] doublePosition = new int[counter];//to collect the length of count of number
        int newIndex = 0;
        for (int blue = number.length - 2; blue>=0; blue-=2) {
            int multiply = number[blue] * 2;
            if (multiply > 9) {
              doublePosition[newIndex] = (multiply / 10) + (multiply % 10);
            }else doublePosition[newIndex] = multiply;
            newIndex++;
        }
        int num = 0;
        for (int index = 0; index < doublePosition.length; index++) {
            num+=doublePosition[index];
        }
//        System.out.println(num);
        return num;
    }
    public static int newValidate(String cardNumber){
        int[] numbers = new int [cardNumber.length()];
        int count=0;
        for(int i = 0 ; i < cardNumber.length(); i++ ){
            numbers[count] = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
            count++;
        }
        int counter = 0;
        for (int index = numbers.length-1; index > 0 ; index -= 2){
            counter++;
        }
        int [] oddPosition = new int[counter];
        int newIndex = 0;
        for (int black = numbers.length-1; black >=0 ; black-=2){
            oddPosition[newIndex] = numbers[black];
           newIndex++;

        }

        int num1 =0;
        for(int index = 0 ; index < oddPosition.length;index++){
            num1 +=oddPosition[index];
        }


        return num1;
    }
    public static String addNumber(int num , int num1){
        int total = num + num1;
        if (total % 10 ==0){
            return "it is valid ";
        }
        return "it is invalid ";
    }
}

//    digit = (array[i] * 2) - 96;
//            System.out.println(digit);
//            if (digit < 10) {
//        sum += digit;
//    } else {
//        sum += 1 + digit % 10;
//    }
//
//}
//        return sum;