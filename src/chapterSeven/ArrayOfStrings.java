package chapterSeven;

import java.util.Arrays;

public class ArrayOfStrings {

    public static int numberOfDigit(String numbers) {

        String [] strArray = new String[]{"1","2","3","4","5","6","7","8","9"};
        String number = Arrays.toString(new String [] {Arrays.toString(numbers.toCharArray())});//extracting the numbers
        System.out.println(number);
        int digit = 0 ;

        char [] charArray = numbers.toCharArray(); //extracting the number into the char array
        System.out.println(charArray);
        for (int count = 0; count < charArray.length; count++) {   //loop through the chararray so we can access the value
            char d = charArray[count];

            if (d == '1'){
                digit++;
            }if (d == '2'){
                digit++;
            }if (d == '3'){
                digit++;
            }if (d == '4'){
                digit++;
            }if (d == '5'){
                digit++;
            }if (d == '6'){
                digit++;
            }if (d == '7'){
                digit++;
            }if (d == '8'){
                digit++;
            }if (d == '9'){
                digit++;
            }


        }


        return digit;
    }



    }

//public static void main(String args[]) {
//    String [] str = {"ABC21F", "13CPZ", "A1L"};
//    int size = str.length;
//    int [] arr = new int [size];
//    for(int i=0; i<size; i++) {
//        arr[i] = Integer.parseInt(str[i]);
//    }
//    System.out.println(Arrays.toString(arr));
//}





