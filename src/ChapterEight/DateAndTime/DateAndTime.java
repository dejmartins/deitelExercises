package ChapterEight.DateAndTime;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DateAndTime {
    private int seconds;
    private int year;

    private int month;

    private int day;
    private final int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateAndTime(){

    }

    public DateAndTime(int year){
        this(year, 0, 0, 0, 0, 0);
    }

    public DateAndTime(int hour, int minute, int seconds){
        this(0, 0, 0, hour, minute, seconds);
    }

    public DateAndTime(int year, int month, int day, int hour, int minute, int second){
        validateDate(year, month, day);
        validateTime(hour, minute, second);
        toSeconds(hour, minute, second);

    }

    private void toSeconds(int hour, int minute, int second){
        this.seconds = (hour * 60 * 60) + (minute * 60) + second;
    }

    public void setHour(int hour) {
        validateHour(hour);
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


    public void setYear(int year) {
        validateYear(year);
        this.year = year;
    }

    public void setMonth(int month) {
        validateMonth(month);
        this.month = month;
    }

    public void setDay(int day) {
        validateDay(day);
        this.day = day;
    }

    public void setDate(int year, int month, int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getHour() {
        verifyNewDay();
        return seconds / 3600;
    }

    public int getMinute() {
        verifyNewDay();
        double val = (double) seconds / 3600;
        BigDecimal bd = BigDecimal.valueOf(val).setScale(6, RoundingMode.CEILING);
        double hour = bd.doubleValue();
        return (int) ((hour - getHour()) * 60);
    }

    public int getSecond() {
        verifyNewDay();
        double val = (double) seconds / 3600;
        BigDecimal bd = BigDecimal.valueOf(val).setScale(6, RoundingMode.CEILING);
        double hour = bd.doubleValue();
        double minute = (hour - getHour()) * 60;
        return (int) ((minute - getMinute()) * 60);
    }

    public void incrementMinute(){
        verifyNewDay();
        seconds += 60;
    }

    public void incrementHour(){
        verifyNewDay();
        seconds += 3600;
    }

    public void tick(){
        verifyNewDay();
        seconds += 1;
    }

    private void verifyNewDay(){
        if (seconds >= 86400) {
            int newSeconds = seconds - 86400;
            seconds = 0;
            seconds += newSeconds;
            nextDay();
        }
    }

    public String toUniversalTime() {
        return String.format("%d.%d.%d %02d:%02d:%02d %s", day, month, year, getHour(), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public String toString() {
        int hr = getHour();
        if(hr > 12) hr = getHour() - 12;
        return String.format("%d.%d.%d %02d:%02d:%02d %s", day, month, year, (hr == 0 || hr == 12 ? 12 : hr), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
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

    private void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateMinute(second);
    }

    private void validateDate(int year, int month, int day){
        validateYear(year);
        validateMonth(month);
        validateDay(day);
    }

    private void validateYear(int year){
        String yearToString = Integer.toString(year);
        if (yearToString.length() != 4 && !(yearToString.charAt(0) < 3 && yearToString.charAt(0) > 0)){
            throw new IllegalArgumentException("Invalid year");
        }
    }

    private void validateMonth(int month){
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
    }

    private void validateDay(int day){
        if(day < 1 || (day > daysPerMonth[month - 1] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("Invalid day in month");
        } else if(day == 29 && month == 2 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("Not a leap year");
        }
    }

    public void nextDay(){
        if (day < daysPerMonth[month - 1] || (month == 2 && day < 29)) {
            day += 1;
        } else if (day == daysPerMonth[month - 1] && month == 12) {
            day = 1;
            month = 1;
            year += 1;
        } else if (day == daysPerMonth[month - 1] || (day == 29 && month == 2)) {
            day = 1;
            month += 1;
        }
    }
}
