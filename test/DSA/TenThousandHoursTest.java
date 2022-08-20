package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenThousandHoursTest {

    @Test
    public void testTimeRequired(){
        TenThousandHours hoursDaily = new TenThousandHours(2, 10);
        String result = hoursDaily.getHoursEquivalent();
        assertEquals(5, result);
    }

}