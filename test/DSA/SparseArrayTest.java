package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SparseArrayTest {

    @Test
    public void testMatchingStringMethod(){
        SparseArray arr = new SparseArray();
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        strings.add("ab");
        strings.add("ab");
        strings.add("abc");

        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        List<Integer> answer = arr.matchingStrings(strings, queries);
        assertEquals(2, answer.get(0));
        assertEquals(1, answer.get(1));
        assertEquals(0, answer.get(2));
    }
}