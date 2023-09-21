package ChapterFour;

public class FunctionThatTakeTwoNumber {


    public static int twoNumber(int number1, int number2) {

//        int result =0;
//        result= number1 * number2;
//        return result;
//    }

        int result = 0;

        if (number1<0)
            number1=-number1;
        if (number2<0)
            number2=-number2;

        for (int count = number1; count >= 1; count--) {
            result+=number2;



            }


        return result;
    }
}



