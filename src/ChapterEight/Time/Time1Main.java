package ChapterEight.Time;

import ChapterEight.Time.Time1;
import Practice.Time;

public class Time1Main {
    public static void main(String[] args) {
        Time1 t1 = new Time1();

        try{
            t1.setTime(11, 59, 59);
            t1.tick();
            t1.incrementHour();
            t1.incrementMinute();

            System.out.printf("%s%n", t1.displayTime());
        }catch (IllegalArgumentException erm){
            System.out.println(erm.getMessage());
        }

        Time1 t2 = new Time1(t1);
        System.out.printf("%n%s%n", t2.displayTime());
    }
}
