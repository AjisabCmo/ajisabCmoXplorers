package ChapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        int numbers = 0;
        int number2=0;
        int number3=0;
        int number4=0;
        System.out.println(" numbers \tnumber2\tnumber3\tnumber4");
        for (int number =1; number<=5;number++) {



            numbers = number;
            number2 = number * number;
            number3 = number * number * number;
            number4 = number * number * number * number;




            System.out.printf("  %d          \t%d     \t%d   \t%d%n", numbers, number2, number3, number4);

        }

    }
}
