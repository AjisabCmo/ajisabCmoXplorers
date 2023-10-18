package chapterSeven;

import java.util.Arrays;

public class MinMaxArray {


    public static int addNumber(int[] array) {
//        int[] array={5,3,4,1,2};
        int sum = 0;
        int count = 0;
        for (count = 0; count < array.length; count++) {
            sum += array[count];

//        return sum;



        }

//    public static void main(String[] args) {
//     int result = addNumber();
//        System.out.println(result);

//}
        return sum;
    }
    public static int minimumNumber(int [] array){
        int minimum = array[0];
        for (int count=0; count< array.length;count++){
          if (array[count] < minimum){
              minimum=array[count];
          }
        }
        return minimum;
    }
    public static int maximumNumber(int [] array){
        int maximum = array[0];
        for (int count=0;count< array.length;count++){
            if (array[count] > maximum){
                maximum=array[count];
            }
        }
        return maximum;
    }

    public static int[] sumMinMax(int [] array){
        int minimum = addNumber(array)-minimumNumber(array);
        int maximum= addNumber(array) - maximumNumber(array);
          return new int [] {minimum,maximum};

    }

    public static void main(String[] args) {
      int [] result= {5,3,4,1,2};
        System.out.println(Arrays.toString(sumMinMax(result)));
    }
}