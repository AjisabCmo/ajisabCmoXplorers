package chapterTwo;

public class FunctionThatTakeTwoNumber {


    public static int twoNumber(int number1, int number2) {

//        int result =0;
//        result= number1 * number2;
//        return result;
//    }

        int result = 2;
        for (int count = 1; count < number1; count++) {
            for (int digit = 1; digit < number2; digit++) {
               result +=2;
            }
        }


        return result;
    }
}



