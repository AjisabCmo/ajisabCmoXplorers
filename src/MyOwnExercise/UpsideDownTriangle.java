package MyOwnExercise;

public class UpsideDownTriangle {
    public static void main(String[] args) {
        int number=5;
        for (int count =1;count<=number;count++){
            for(int digit =1;digit<=count-1;digit++){
                System.out.print(" ");

            }
            for (int star =1;star <=2*(number-count)+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
