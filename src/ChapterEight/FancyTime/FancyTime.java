package ChapterEight.FancyTime;


public class FancyTime {
    private Date date;

    public FancyTime(int hour, int minute, int second, String meridiem){
        date = new Date(hour, minute, second, meridiem);
    }

    public FancyTime(int hour, int minute, int second){
        this(hour, minute, second, null);
        date = new Date(hour, minute, second);
    }

    public FancyTime(int hour, int minute){
        this(hour, minute, 0 , null);
        date = new Date(hour, minute);
    }

    public String displayTime(int format){
        if (format == 1){
            return String.format("%d:%d:%d %s", date.getHour(), date.getMinute(), date.getSecond(), date.getMeridiem());
        } else if (format == 2) {
            return String.format("%d:%d:%d ", date.getHour(), date.getMinute(), date.getSecond());
        } else if(format == 3) {
            return String.format("%d:%d ", date.getHour(), date.getMinute());
        }
        return null;
    }


}
