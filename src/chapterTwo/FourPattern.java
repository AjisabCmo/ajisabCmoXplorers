package chapterTwo;

public class FourPattern {
    public static void main(String[] args) {
        int number = 6;
        System.out.println("pattern A:");
        for (int row=1;row<=number;row++){
            for (int digit =1;digit<=row;digit++){
                System.out.print(" "+ digit);
            }
            System.out.println();
        }

        System.out.println("\n pattern B:");
        for (int row=1;row<=number;row++){
            for (int digit =1; digit <= (int)(number -row+1);digit++){//number which is 6 - row which is 1 and + 1
                System.out.print(digit + " ");
            }
            System.out.println();
        }
        System.out.println("pattern D: ");
        for (int row =1;row<=number;row++){
            for (int whitespace =2;whitespace<=row;whitespace++) {
                System.out.print("  ");
            }
                for (int digit=1;digit<=(int)(number-row +1);digit++){
                    System.out.print(digit + " ");

            }
            System.out.println();
        }
    }
}
