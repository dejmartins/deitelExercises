package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MigratoryBirdsTest {

    @Test
    public void testMostSightedBird(){
        MigratoryBirds birds = new MigratoryBirds();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);

        int result = birds.getMigratoryBirds(arr);
        assertEquals(1, result);
    }

}