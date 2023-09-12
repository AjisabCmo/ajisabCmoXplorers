package chapterTwo;
import java.util.Date;
public class CreateDates {
    public static void main(String[] args){
        Date d1,d2,d3;

        d1 = new Date();

        System.out.println("date1:" + d1);

        d2=new Date (19,12,1,7,30);
        System.out.println("date2:" + d2);

        d3 = new Date("december 1 2022 5:30 PM");
         System.out.println("Date3:" + d3);



    }
}
