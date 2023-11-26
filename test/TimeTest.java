import ChibuzorTask.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeTest {



  @Test
  public void createTime()  {
    Time time = new Time (1,0,0);
      assertEquals(time.gethour(),1);
      assertEquals(time.getMinute(),0);
      assertEquals(time.getSeconds(),0);


  }
  @Test
    public void createTimeWithInvalidHourTest(){
      assertThrows(IllegalArgumentException.class, ()-> new Time(25,89,90));
  }
  @Test
    public void createTimeWithInvalidMinutesTest(){
      assertThrows(IllegalArgumentException.class,()-> new Time(25,68,99));
  }
  @Test
    public void createTimeWithInvalidSecondsTest(){
      assertThrows(IllegalArgumentException.class,()-> new Time (25,68,99));
  }


    }

