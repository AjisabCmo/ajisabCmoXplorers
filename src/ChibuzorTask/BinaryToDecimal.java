package ChibuzorTask;

public class BinaryToDecimal {

public static int binaryDecimal(String binaryNumber) {

    int decimal = 0;
    for (int count = 0; count < binaryNumber.length(); count++) {
        char number = binaryNumber.charAt(binaryNumber.length() - count - 1);
        if (number == '1') {
            decimal += (int) Math.pow(2, count);
        }
    }


    return decimal;
}}

//    public static String decimalBinary(int decimalNumber) {
//
//
//
//
//
//
//
////    }
//}
