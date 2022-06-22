package tddClass.ChapterEight;

import ChapterEight.Time.Time1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeTest {
    @Test
    public void testSetTime24HourClock_UniversalTime(){
        Time1 time = new Time1();
        time.setTime(13, 30, 5);
        assertEquals("13:30:05 PM", time.toUniversalTime());
    }

    @Test
    public void testThatTimeDoesNotExceedUniversalRange(){
        Time1 time = new Time1();
        assertThrows(IllegalArgumentException.class, () -> time.setTime(25, 70, 73));
        assertEquals("00:00:00 AM", time.toUniversalTime());
    }

    @Test
    public void testSetTime12HourClock_StandardTime(){
        Time1 time = new Time1();
        time.setTime(12, 24, 56);
        assertEquals("12:24:56 PM", time.toString());
    }

}
