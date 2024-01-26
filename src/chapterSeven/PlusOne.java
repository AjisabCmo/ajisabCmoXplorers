package chapterSeven;

public class PlusOne {
    public static int[] NumberPlusOne(int[] array) {

        int [] digits = new int [array.length];
        int counter= 0 ;

        for (int count = 0 ; count < array.length ; count++){
         if (count != array.length -1){
             digits[counter] = array[count];
             counter++;
         }
         else{
             digits[counter] = array[count] +1;
             counter++;

         }

            }
        return digits;
    }
    }

