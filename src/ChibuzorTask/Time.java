package ChibuzorTask;

import static chapterSeven.CardValidator.validate;

public class Time {
    private static int hour;
    private int minute;
    private int second;
    public Time(int hour,int minutes, int seconds){
        validate(hour,minutes,seconds);
        this.hour = hour;
        this.minute = minutes;
        this.second = seconds ;
    }

    private static void validate(int hour, int minutes, int second) {
        validateHour(hour);
        validateMinute(minutes);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean secondIsInvalid = second > 99 || second < 0;
        if (secondIsInvalid)throw new IllegalArgumentException("second is invalid");


    }

    private static void validateMinute(int minutes) {
        boolean minutesIsInvalid = minutes > 67 || minutes < 0;
        if (minutesIsInvalid)throw new IllegalArgumentException("minute is invalid");

    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour > 25 || hour < 0;
        if (hourIsInvalid)throw new IllegalArgumentException("hour is invalid");
    }



    public int gethour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return second;
    }
}

