package ChapterEight.DateAndTime;

public class Main {
    public static void main(String[] args) {
        DateAndTime today = new DateAndTime();

        try{
            today.setTime(1, 59, 59);
            today.setDate(2020, 9, 30);
            today.tick();
            today.incrementHour();
            today.incrementHour();
            today.incrementMinute();
            today.incrementMinute();

            System.out.printf("%s%n", today.displayTime());
        }catch (IllegalArgumentException erm){
            System.out.println(erm.getMessage());
        }
    }
}
