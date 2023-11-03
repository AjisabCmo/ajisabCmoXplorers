package chapterSeven;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeProduct {
    public static  int  primeFactorsProduct(int   num) {
        ArrayList<Integer> factors = new ArrayList<>();
        int count = 2;
        while ( count <= num) {
            if (num % count != 0) {
                count++;
            }
                num /= count;
                factors.add(((int)count));
                count++;

        }
        if (num > 1) {
            factors.add((int) num);
        }

        int product = 1;
        for (Integer factor : factors) {
            product *= factor;
        }

        return product;
    }

    public static void main(String[] args) {
        int [] num = {24};
        System.out.println(Arrays.toString(num));
    }
}
