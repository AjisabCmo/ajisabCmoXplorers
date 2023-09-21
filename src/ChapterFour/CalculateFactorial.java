package ChapterFour;

public class CalculateFactorial {
    public static void main(String[] args) {
        int total = 1;
        double sum = 0;
        int number = 5;
        for (int count = 1; count <= number; count++) {
            double result = calculateExponential(count);
                    total *= number;
            System.out.println(total+ "first total");
                   double dividend = total / result;
            System.out.println(dividend);
                    sum += dividend;
            System.out.println(sum);
        }
    }
    public static int calculateFactorial(int number) {
        int factorial=1;
        for (int count= number;count>=1;count--){
            factorial =factorial*count;
        }
        return factorial;
    }

    public static double calculateExponential(int number) {
        double exponential=1;
        int numerator=1;
        for (int count=1;count <=number;count++){
            int denominator=calculateFactorial(count);
            double dividend=(double)numerator/denominator;
            exponential=exponential+dividend;
        }
        String result =String.format("%.3f",exponential);
        double res=Double.valueOf(result);


        return res;
    }

    public static double calculateExponentialX(int number) {
        double total = 1;
        double sum = 1;
        for (int count = 1; count <= number; count++){
           double result = calculateExponential(number);
            total *= number;
            result *= total;
            sum += result;
        }
        return sum;
    }
}
