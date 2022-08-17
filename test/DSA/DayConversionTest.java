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

    @Test
    public void testValueToDayEquivalentMethod2(){
        DayConversion dayConversion = new DayConversion(719);
        String result = dayConversion.getDuration();
        assertEquals("1y11m29d", result);
    }

    @Test
    public void testValueToDayEquivalentMethod3(){
        DayConversion dayConversion = new DayConversion(720);
        String result = dayConversion.getDuration();
        assertEquals("2y", result);
    }

    @Test
    public void testValueToDayEquivalentMethod4(){
        DayConversion dayConversion = new DayConversion(1082);
        String result = dayConversion.getDuration();
        assertEquals("3y2d", result);
    }

}