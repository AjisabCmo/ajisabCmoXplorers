package ChibuzorTask;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        int total = 0;
        for (int count = 0; count <= 10; count += 2) {
               total += count;
        }
        System.out.println("sum of total is : " + total);
    }
}