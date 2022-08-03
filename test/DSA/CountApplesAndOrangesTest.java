package DSA;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountApplesAndOrangesTest {

    @Test
    public void countApplesAndOranges(){
        List<Integer> apples = new ArrayList<>();
        apples.add(2);
        apples.add(3);
        apples.add(-4);

        List<Integer> oranges = new ArrayList<>();
        oranges.add(3);
        oranges.add(-2);
        oranges.add(-4);

        CountApplesAndOranges countApplesAndOranges = new CountApplesAndOranges();
        String result = countApplesAndOranges.getCountOfApplesAndOranges(7, 10, 4, 12, apples, oranges);
        assertEquals("1 2", result);
    }

}