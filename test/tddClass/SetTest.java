package tddClass;

import Assignments.Set.Set;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {

    @Test
    public void sumOverlappingElementsInTwoSets(){
        LinkedList<Integer> set1 = new LinkedList<>();
        set1.add(3); set1.add(1); set1.add(7); set1.add(9);

        LinkedList<Integer> set2 = new LinkedList<>();
        set2.add(2); set2.add(4); set2.add(1); set2.add(9);set2.add(3);

        Set set = new Set();
        int result = set.sumOfOverlappingElementsIn(set1, set2);
        assertEquals(13, result);
    }

    @Test
    public void sumDistinctElementsInTwoSets(){
        LinkedList<Integer> set1 = new LinkedList<>();
        set1.add(12); set1.add(13); set1.add(6); set1.add(10);

        LinkedList<Integer> set2 = new LinkedList<>();
        set2.add(13); set2.add(10); set2.add(16); set2.add(15);

        Set set = new Set();
        int result = set.sumOfDistinctElementsIn(set1, set2);
        assertEquals(49, result);
    }
}
