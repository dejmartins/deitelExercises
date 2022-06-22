package ChapterEight.FancyTime;

public class Date {
    private final int hour;
    private final int minute;
    private final int second;
    private final String meridiem;
    public Date(int hour, int minute, int second, String meridiem) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridiem = meridiem;
    }

    public Date(int hour, int minute, int second) {
        this(hour, minute, second, null);
    }

    public Date(int hour, int minute) {
        this(hour, minute, 0, null);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getMeridiem() {
        return meridiem;
    }
}
