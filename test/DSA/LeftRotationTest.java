package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotationTest {

    @Test
    public void testRotation(){
        LeftRotation rotation = new LeftRotation();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr = rotation.rotateLeft(2, arr);

        assertEquals(3, arr.get(0));
        assertEquals(4, arr.get(1));
        assertEquals(5, arr.get(2));
    }

}