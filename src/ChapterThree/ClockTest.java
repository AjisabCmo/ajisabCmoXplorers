package ChapterThree;

public class ClockTest {
  public static void main(String[] args){

      Clock clock = new Clock(23,59,59);

      System.out.println("Hour: " + clock.getHour());
      System.out.println("Minute: " + clock.getMinute());
      System.out.println("Second: " + clock.getSecond());
      clock.displayTime();


    }
}
