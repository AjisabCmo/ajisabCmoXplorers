package chapterSeven;

import java.util.ArrayList;

public class Lcm {
    public static int [] calculateLcm(int number) {
        ArrayList<Integer> results = new ArrayList<>();
        int divisor =2 ;
        while (number > 1){
            if (number % divisor == 0){
                results.add(divisor);
                number = number / divisor;
                divisor = 2;

            } else {
                ++divisor;
            }
        }
        return convertToArray(results);
    }

    private static int[] convertToArray(ArrayList<Integer> results) {
        int [] result = new int [results.size()];
        for (int count = 0; count < result.length; count++) {
            result[count] = results.get(count);

        }
        return result;
    }
}
