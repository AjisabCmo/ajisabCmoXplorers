package chapterSix;

public class MathematicsFunction {
    public int mysquare(int number ) {
        int square =1;
        square=number*number;

        return square;
    }

    public int divide(int firstNumber, int secondNumber) {
        int divide=0;
        divide=firstNumber/secondNumber;
        return divide;
    }

    public boolean palindrome(int number) {

        int numbers=number;
      int   reverse=0;
      while (number!=0){
       int    remainder=number % 10;
       reverse=reverse * 10 + remainder;
       number=number/10;
       if (numbers==reverse){
           return true;

       } else if (numbers!=reverse) {
           return false;



       }


       }

        return false;
    }
}
