package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayConversionTest {

    @Test
    public void testValueToDayEquivalentMethod(){
        DayConversion dayConversion = new DayConversion(365);
        String result = dayConversion.getDuration();
        assertEquals("1y5d", result);
    }

}