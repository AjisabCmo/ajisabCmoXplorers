package chapterSeven;

public class DuplicateNumber {
    public static int[] bringOutSameNumber(int[] array) {
        int notwell = 0 ;
        for (int count = 0; count < array.length; count++) {
            for (int index = count +1; index < array.length; index++) {
                if (array[count] == array[index]) {
                    notwell++;

                }
            }
        }
           int []number = new int[notwell];
        int counter = 0;
        for (int count = 0; count < array.length; count++) {
            for (int index = count +1; index < array.length ; index++) {
                int nums = array[index];
                if (nums == array[count]){
                    number[counter]=nums;
                    counter++;
                }

            }

        }

        return number;
    }

    public static boolean checkPalindrome(String str) {
        if (str.isEmpty() || str.length()==1){
            return false;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return checkPalindrome(str.substring(1,str.length()-1));

        }

        return true;
    }

    public static int[] findDorminanceElements(int[] input) {
        int [] result = new int[input.length];
        for(int index1 = 0 ; index1 < input.length ; index1++)
            findDorminance(input,index1,result);
        result[result.length-1] = input[input.length-1];
        return removeZerosFrom(result);

          }
          private static void findDorminance(int [] input, int index1,int [] result){
                  int currentElement = input [index1];
                  for (int index2 = index1+1 ; index2 < input.length ; index2++) {
                      if (currentElement < input[index2]) break;
                      if (index2 == input.length - 1) result[index1] = currentElement;
                  }
        }
        private static int [] removeZerosFrom(int [] numbers){
        int count = 0;
            for (int number : numbers)
                if ( number != 0)
                    count++;
            int [] result = new int [count];
            count=0;
            for (int index = 0 ; index < numbers.length ; index++){
                if (numbers[index] != 0) {
                    result[count] = numbers[index];
                    count++;

                }
            }
            return result;
        }


    }

