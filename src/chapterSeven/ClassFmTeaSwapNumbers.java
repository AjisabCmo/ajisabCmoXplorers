package chapterSeven;

public class ClassFmTeaSwapNumbers {

    public static int[] swapNumbers(int [] numbers, int firstIndex, int secondIndex) {

    numbers[firstIndex]=numbers[firstIndex]+numbers[secondIndex];
    numbers[secondIndex]=numbers[firstIndex]-numbers[secondIndex];
    numbers[firstIndex]=numbers[firstIndex]-numbers[secondIndex];

        return numbers;
    }

    }


