package ChapterEight.Time;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Time1 {
    private int seconds;

    public Time1(){

    }

    public Time1(int hour){
        this(hour, 0, 0);
    }

    public Time1(int hour, int minute){
        this(hour, minute, 0);
    }

    public Time1(int hour, int minute, int second) {
        validate(hour, minute, second);
        toSeconds(hour, minute, second);
    }

    public Time1(Time1 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    private void toSeconds(int hour, int minute, int second){
        this.seconds = (hour * 60 * 60) + (minute * 60) + second;
    }

    private void setHour(int hour) {
        this.seconds += (hour * 60 * 60);
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.seconds += (minute * 60);
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.seconds += second;
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        verifyNewDay();
        return seconds / 3600;
    }

    public int getMinute() {
        double val = (double) seconds / 3600;
        BigDecimal bd = BigDecimal.valueOf(val).setScale(6, RoundingMode.CEILING);
        double hour = bd.doubleValue();
        return (int) ((hour - getHour()) * 60);
    }

    public int getSecond() {
        double val = (double) seconds / 3600;
        BigDecimal bd = BigDecimal.valueOf(val).setScale(6, RoundingMode.CEILING);
        double hour = bd.doubleValue();
        double minute = (hour - getHour()) * 60;
        return (int) ((minute - getMinute()) * 60);
    }

    public void incrementMinute(){
        seconds += 60;
    }

    public void incrementHour(){
        seconds += 3600;
    }

    public void tick(){
        seconds += 1;
    }

    private void verifyNewDay(){
        if (seconds >= 86400) {
            int newSeconds = seconds - 86400;
            seconds = 0;
            seconds += newSeconds;
        }
    }
    public String toUniversalTime() {
        return String.format("%02d:%02d:%02d %s", getHour(), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public String toString() {
        int hr = getHour();
        if(hr > 12) hr = getHour() - 12;
        return String.format("%02d:%02d:%02d %s", (hr == 0 || hr == 12 ? 12 : hr), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public String displayTime(){
        return String.format("%s%n%s", toUniversalTime(), this);
    }

    private void validateHour(int hour){
        if(hour < 0 || hour > 23) throw new IllegalArgumentException("Hour is invalid");
    }

    private void validateMinute(int minute){
        if(minute < 0 || minute > 60) throw new IllegalArgumentException("Minute is invalid");
    }

    private void validateSecond(int second){
        if(second < 0 || second > 60) throw new IllegalArgumentException("Second is invalid");
    }

    private void validate(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateMinute(second);
    }
}
