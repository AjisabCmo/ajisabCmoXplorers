package myClassTea;

public class FizzBuzz {
    public static void main(String[] args) {
        int number=1;
        while (number <=50 ){
            if (number%5==0 && number%3==0){
                System.out.println("FizzBuzz");
            } else if (number%3==0) {
                System.out.println("fizz");

            } else if (number%5==0) {
                System.out.println("Buzz");

            }else{

                System.out.println(number);

            }
        number++;
        }
    }
}
