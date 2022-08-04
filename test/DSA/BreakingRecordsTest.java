package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreakingRecordsTest {

    @Test
    public void testBreakingRecords(){
        BreakingRecords broken = new BreakingRecords();
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        List<Integer> result = broken.getNumberOfBrokenRecords(scores);
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
    }
}