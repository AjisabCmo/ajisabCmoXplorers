package ChapterFour;

public class NestForLoopWeekendTask {

    // public static void main(String[] args) {
    public static int pattern(int count) {
        int rows = 5;

        for (count = 1; count <= rows; count++) {

            for (int digit = 1; digit <= rows; digit++) {
                System.out.print("");
            }


            for (int star = 1; star <= count * 1; star++) {
                System.out.print("\t*");
            }


            System.out.println();
        }


        for (count = rows - 1; count >= 1; count--) {
            for (int digit = 1; digit <= count; digit++) {
                System.out.print(" \t*");
            }
            System.out.println();
        }

        return rows;

    }

    public static void main(String[] args) {
        System.out.println(pattern(1));

    }
}