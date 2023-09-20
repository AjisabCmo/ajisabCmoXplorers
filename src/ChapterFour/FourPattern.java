package ChapterFour;

public class FourPattern {
    public static void main(String[] args) {
        int number = 6;
        System.out.println("pattern A:");
        for (int row=1;row<=number;row++){
            for (int column =1;column<=row;column++){
                System.out.print(" "+ column);
            }
            System.out.println();
        }

        System.out.println("\n pattern B:");
        for (int row=1;row<=number;row++){
            for (int column =1; column <= (int)(number -row+1);column++){//number which is 6 - row which is 1 and + 1
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("pattern D: ");
        for (int row =1;row<=number;row++){
            for (int whitespace =2;whitespace<=row;whitespace++) {
                System.out.print("  ");
            }
                for (int column=1;column<=(int)(number-row +1);column++){
                    System.out.print(column + " ");

            }
            System.out.println();
        }
    }
}
