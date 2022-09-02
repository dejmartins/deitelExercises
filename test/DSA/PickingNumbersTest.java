package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PickingNumbersTest {

    @Test
    public void testPickingNumbersMethod(){
        PickingNumbers numbers = new PickingNumbers();
       List<Integer> a = new ArrayList<>();
       a.add(1);
       a.add(1);
       a.add(2);
       a.add(2);
       a.add(4);
       a.add(4);
       a.add(5);
       a.add(5);
       a.add(5);

       int result = numbers.getSize(a);
       assertEquals(5, result);
    }

    @Test
    public void testPickingNumbersMethod2(){
        PickingNumbers numbers = new PickingNumbers();
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(3);
        a.add(1);

        int result = numbers.getSize(a);
        assertEquals(3, result);
    }

    @Test
    public void testPickingNumbersMethod3(){
        PickingNumbers numbers = new PickingNumbers();
        List<Integer> a = new ArrayList<>();
        a.add(98);
        a.add(3);
        a.add(99);
        a.add(1);
        a.add(97);
        a.add(2);

        int result = numbers.getSize(a);
        assertEquals(2, result);
    }
}