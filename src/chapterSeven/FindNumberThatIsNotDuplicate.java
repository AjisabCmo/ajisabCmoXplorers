package chapterSeven;

public class FindNumberThatIsNotDuplicate {
    public static int[] notDuplicateNumber(int[] array) {
        int notDuplicate = 0;
        int counter = 0;
        int count;

        for (count = 0; count < array.length; count++) {
            int digit;
            for (digit = 0; digit < array.length; digit++) {
                if ( array[count] == array[digit]) {
                    counter++;
                }

            }
            if (counter==1) {
                notDuplicate = array[count];

            }
            counter = 0;

        }

        return new int[]{notDuplicate};
    }
}
