package chapterSix;

public class SumDigits {
    public int sum(int number) {

        int digit =0;
        while (number>0){
            int remainder= number % 10;
            digit+=remainder;
            number=number/10;
        }


        return digit;
    }
}
