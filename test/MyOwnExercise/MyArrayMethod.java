package MyOwnExercise;

public class MyArrayMethod {

    public static int[] sort(int[] numbers) {
        int [] element = new int [numbers.length];
        for(int counter = 0 ; counter < numbers.length;){
            int number = numbers[counter];
            int count;
            for (count =counter+1; count < numbers.length; count++){
                if(number > numbers[count])break;
            }
            if (count == numbers.length){
                element[counter]=number;
                counter++;
            }else{
                int temp = numbers[count];
                numbers[count] = number;
                numbers[counter] = temp;
            }
        }
        return element;
    }
}
