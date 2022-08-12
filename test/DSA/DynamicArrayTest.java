package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @Test
    public void testDynamicArrayMethod(){
        DynamicArray dy = new DynamicArray();

        List<List<Integer>> queries = new ArrayList<>();

        List<Integer> query1 = new ArrayList<>();
        query1.add(1);
        query1.add(0);
        query1.add(5);

        List<Integer> query2 = new ArrayList<>();
        query2.add(1);
        query2.add(1);
        query2.add(7);

        List<Integer> query3 = new ArrayList<>();
        query3.add(1);
        query3.add(0);
        query3.add(3);

        List<Integer> query4 = new ArrayList<>();
        query4.add(2);
        query4.add(1);
        query4.add(0);

        List<Integer> query5 = new ArrayList<>();
        query5.add(2);
        query5.add(1);
        query5.add(1);

        queries.add(query1);
        queries.add(query2);
        queries.add(query3);
        queries.add(query4);
        queries.add(query5);

        List<Integer> answer = dy.dynamicArray(2, queries);

        assertEquals(7, answer.get(0));
        assertEquals(3, answer.get(1));
        assertEquals(2, answer.size());
    }
}