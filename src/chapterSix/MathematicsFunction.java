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

    public int factorial(int number) {
       int factorial=1;
       for (int digit =1;digit<=number;digit++){
           factorial*=digit;
       }

        return factorial;
    }

    public int factor(int number) {
      int factor=0;
      int count =1;
      for (count=1;count<=number;count++){
          if (number%count==0){
              factor++;
          }
      }
        return factor;
    }

    public boolean evenAndOddNumbers(int number) {

            if (number%2==0){
                return true;

            }else return false;

    }
}
