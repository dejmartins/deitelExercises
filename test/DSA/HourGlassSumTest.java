package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HourGlassSumTest {

    @Test
    public void testIndividualSum(){
        HourGlassSum hourGlassSum = new HourGlassSum();
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> rollOne = new ArrayList<>();
        rollOne.add(1);
        rollOne.add(1);
        rollOne.add(1);
        rollOne.add(0);
        rollOne.add(0);
        rollOne.add(0);

        List<Integer> rollTwo = new ArrayList<>();
        rollTwo.add(0);
        rollTwo.add(1);
        rollTwo.add(0);
        rollTwo.add(0);
        rollTwo.add(0);
        rollTwo.add(0);

        List<Integer> rollThree = new ArrayList<>();
        rollThree.add(1);
        rollThree.add(1);
        rollThree.add(1);
        rollThree.add(0);
        rollThree.add(0);
        rollThree.add(0);

        List<Integer> rollFour = new ArrayList<>();
        rollFour.add(0);
        rollFour.add(0);
        rollFour.add(2);
        rollFour.add(4);
        rollFour.add(4);
        rollFour.add(0);

        List<Integer> rollFive = new ArrayList<>();
        rollFive.add(0);
        rollFive.add(0);
        rollFive.add(0);
        rollFive.add(2);
        rollFive.add(0);
        rollFive.add(0);

        List<Integer> rollSix = new ArrayList<>();
        rollSix.add(0);
        rollSix.add(0);
        rollSix.add(1);
        rollSix.add(2);
        rollSix.add(4);
        rollSix.add(0);

        arr.add(0, rollOne);
        arr.add(1, rollTwo);
        arr.add(2, rollThree);
        arr.add(3, rollFour);
        arr.add(4, rollFive);
        arr.add(5, rollSix);

        int result = hourGlassSum.getSum(arr);
        assertEquals(19, result);
    }

    @Test
    public void testIndividualSum2(){
        HourGlassSum hourGlassSum = new HourGlassSum();
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> rollOne = new ArrayList<>();
        rollOne.add(-1);
        rollOne.add(-1);
        rollOne.add(0);
        rollOne.add(-9);
        rollOne.add(-2);
        rollOne.add(-2);

        List<Integer> rollTwo = new ArrayList<>();
        rollTwo.add(-2);
        rollTwo.add(-1);
        rollTwo.add(-6);
        rollTwo.add(-8);
        rollTwo.add(-2);
        rollTwo.add(-5);

        List<Integer> rollThree = new ArrayList<>();
        rollThree.add(-1);
        rollThree.add(-1);
        rollThree.add(-1);
        rollThree.add(-2);
        rollThree.add(-3);
        rollThree.add(-4);

        List<Integer> rollFour = new ArrayList<>();
        rollFour.add(-1);
        rollFour.add(-9);
        rollFour.add(-2);
        rollFour.add(-4);
        rollFour.add(-4);
        rollFour.add(-5);

        List<Integer> rollFive = new ArrayList<>();
        rollFive.add(-7);
        rollFive.add(-3);
        rollFive.add(-3);
        rollFive.add(-2);
        rollFive.add(-9);
        rollFive.add(-9);

        List<Integer> rollSix = new ArrayList<>();
        rollSix.add(-1);
        rollSix.add(-3);
        rollSix.add(-1);
        rollSix.add(-2);
        rollSix.add(-4);
        rollSix.add(-5);

        arr.add(0, rollOne);
        arr.add(1, rollTwo);
        arr.add(2, rollThree);
        arr.add(3, rollFour);
        arr.add(4, rollFive);
        arr.add(5, rollSix);

        int result = hourGlassSum.getSum(arr);
        assertEquals(-6, result);
    }


}