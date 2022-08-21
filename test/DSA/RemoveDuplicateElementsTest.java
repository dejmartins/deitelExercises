package DSA;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateElementsTest {

    @Test
    public void testMethodToRemoveDuplicates(){
        int[] arr = {1, 1, 2, 2, 2};
        RemoveDuplicateElements removeDuplicateElements = new RemoveDuplicateElements();

        arr = removeDuplicateElements.removeDuplicates(arr);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(2, arr.length);
        assertEquals("[1, 2]", Arrays.toString(arr));
    }
}