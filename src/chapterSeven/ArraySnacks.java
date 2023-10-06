package chapterSeven;

public class ArraySnacks {
    public static int getOddPosition(int[] array) {
        int sum =0;
        int count =1;
        for ( count = 1 ; count < array.length ; count += 2){
            sum+=array[count];
        }

        return sum;
    }

    public static int addOddNumber(int[] array) {
        int sum =0;
        int count =0;
        for (count =0;count < array.length;count++){
            if (array[count]%2==1){
                sum+=array[count];
            }
        }
        return sum;
    }

    public static int addEvenNumber(int[] array) {
        int sum =0;
        int count = 0;
        for (count = 0 ; count < array.length; count++){
            if (array[count]%2==0){
                sum+=array[count];
            }
        }
        return sum;
    }

    public int getEvenPosition(int[] array) {
        int sum =0;
        int count =0;
        for (count = 0 ; count < array.length ; count += 2){
            sum += array[count];
        }
        return sum;
    }
}
