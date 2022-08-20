package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test public void testNumberOfValleyTraverseMethod(){
        CountingValleys valley = new CountingValleys();
        int result = valley.countingValleys(8, "UDDDUDUU");
        assertEquals(1, result);
    }

    @Test public void testNumberOfValleyTraverseMethod2(){
        CountingValleys valley = new CountingValleys();
        int result = valley.countingValleys(8, "DDUUUUDD");
        assertEquals(1, result);
    }

    @Test public void testNumberOfValleyTraverseMethod3(){
        CountingValleys valley = new CountingValleys();
        int result = valley.countingValleys(12, "DDUUDDUDUUUD");
        assertEquals(2, result);
    }

    @Test public void testNumberOfValleyTraverseMethod4(){
        CountingValleys valley = new CountingValleys();
        int result = valley.countingValleys(10, "UDUUUDUDDD");
        assertEquals(0, result);
    }

}