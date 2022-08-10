package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    public void testMethodToReverseArray(){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ReverseArray reverseArray = new ReverseArray();

        List<Integer> newArr = reverseArray.reverseArray(arr);
        assertEquals(3, newArr.get(0));
        assertEquals(2, newArr.get(1));
        assertEquals(1, newArr.get(2));

    }

}