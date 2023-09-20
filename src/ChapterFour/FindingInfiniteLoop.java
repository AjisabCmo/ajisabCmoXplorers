package ChapterFour;

public class FindingInfiniteLoop{
    public static void main(String[] args) {
        int number=100;
        while(number>25){
            System.out.println("infinite loop");
            number-=35;
        }
    }
}
