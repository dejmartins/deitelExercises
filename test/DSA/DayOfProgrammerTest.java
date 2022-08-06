package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfProgrammerTest {

    @Test
    public void testForLeapYearJulianCalendar(){
        DayOfProgrammer date = new DayOfProgrammer();
        String day = date.getDate(1800);

        assertEquals("12.09.1800", day);
    }

    @Test
    public void testForLeapYearGregorianCalendar(){
        DayOfProgrammer date = new DayOfProgrammer();
        String day = date.getDate(2016);

        assertEquals("12.09.2016", day);
    }

    @Test
    public void testForNormalYearGregorianCalendar(){
        DayOfProgrammer date = new DayOfProgrammer();
        String day = date.getDate(2017);

        assertEquals("13.09.2017", day);
    }

    @Test
    public void testForYear1918(){
        DayOfProgrammer date = new DayOfProgrammer();
        String day = date.getDate(1918);

        assertEquals("26.09.1918", day);
    }

}