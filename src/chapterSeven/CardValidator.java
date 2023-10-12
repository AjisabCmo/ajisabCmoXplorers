package chapterSeven;

public class CardValidator {

    public static void main(String[] args) {
//        validate("123456789875");
    }

    public boolean validateCardLength(String cardNUmber) {
        if (cardNUmber.length() <= 16 && cardNUmber.length() >= 13) {
            return true;
        }
        return false;
    }

    public static String validateCardType(String cardNUmber) {
        if (cardNUmber.charAt(0) == '4') {
            return "Visa Card";
        } else if (cardNUmber.charAt(0) == '5') {
            return "Master Card";
        } else if (cardNUmber.startsWith("37")) {
            return "American Express Card";
        } else if (cardNUmber.startsWith("6")) {
            return "Discover Card";
        }

        return "Invalid Card";
    }


//    public static int validate(String cardNumber){
//        int sum = 0;
//        int digit;
//        char[] array = cardNumber.toCharArray();
//        for (int i = 0; i < array.length; i+=2) {
//            digit = (array[i]*2)-96;
//            System.out.println(digit);
//            if (digit < 10){
//                sum += digit;
//            }
//            else {
//                sum += 1 + digit%10;
//            }
//
//        }
//        return sum;
}


