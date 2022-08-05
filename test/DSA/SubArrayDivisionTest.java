package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayDivisionTest {

    @Test
    public void testSubArray(){
        SubArrayDivision sub = new SubArrayDivision();
        List<Integer> chocolates = new ArrayList<>();
        chocolates.add(2);
        chocolates.add(2);
        chocolates.add(1);
        chocolates.add(3);
        chocolates.add(2);

        int result = sub.getNumberOfSegments(chocolates, 4, 2);
        assertEquals(2, result);
    }

    @Test
    public void testSubArray2(){
        SubArrayDivision sub = new SubArrayDivision();
        List<Integer> chocolates = new ArrayList<>();
        chocolates.add(1);
        chocolates.add(2);
        chocolates.add(1);
        chocolates.add(3);
        chocolates.add(2);

        int result = sub.getNumberOfSegments(chocolates, 3, 2);
        assertEquals(2, result);
    }

    @Test
    public void testSubArray3(){
        SubArrayDivision sub = new SubArrayDivision();
        List<Integer> chocolates = new ArrayList<>();
        chocolates.add(1);
        chocolates.add(1);
        chocolates.add(1);
        chocolates.add(1);
        chocolates.add(1);
        chocolates.add(1);

        int result = sub.getNumberOfSegments(chocolates, 3, 2);
        assertEquals(0, result);
    }

    @Test
    public void testSubArray4(){
        SubArrayDivision sub = new SubArrayDivision();
        List<Integer> chocolates = new ArrayList<>();
        chocolates.add(2);
        chocolates.add(5);
        chocolates.add(1);
        chocolates.add(3);
        chocolates.add(4);
        chocolates.add(4);
        chocolates.add(3);
        chocolates.add(5);
        chocolates.add(1);
        chocolates.add(1);
        chocolates.add(2);
        chocolates.add(1);
        chocolates.add(4);
        chocolates.add(1);
        chocolates.add(3);
        chocolates.add(3);
        chocolates.add(4);
        chocolates.add(2);
        chocolates.add(1);

        int result = sub.getNumberOfSegments(chocolates, 18, 7);
        assertEquals(3, result);
    }

}