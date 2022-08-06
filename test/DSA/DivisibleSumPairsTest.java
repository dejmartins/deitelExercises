package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleSumPairsTest {

    @Test
    public void testDivisibleSumPairs(){
        DivisibleSumPairs sum = new DivisibleSumPairs();
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);

        int result = sum.divisibleSumPairs(6, 5, ar);
        assertEquals(3, result);
    }

}