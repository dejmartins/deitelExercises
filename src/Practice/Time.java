package Practice;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int minute, int second){
        this(0, minute, second);
    }

    public Time(int second){
        this(0, 0, second);
    }

    public Time(){
        this(0, 0, 0);
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        validateSeconds(second);
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second){
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    private static void validate(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(second);
    }

    private static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }

    private static void validateMinute(int minute){
        boolean minuteIsInvalid = minute < 0 || minute >= 60;
        if(minuteIsInvalid) throw new IllegalArgumentException("Invalid minute");
    }

    private static void validateSeconds(int second){
        boolean secondIsInvalid = second < 0 || second >= 60;
        if(secondIsInvalid) throw new IllegalArgumentException("Invalid seconds");
    }
}
