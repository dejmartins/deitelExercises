package Assignments.Set;

import java.util.LinkedList;

public class Set {
    public int sumOfOverlappingElementsIn(LinkedList<Integer> set1, LinkedList<Integer> set2) {
        int sum = 0;
        for (Integer element : set1) {
            if (set2.contains(element)) {
                sum += element;
            }
        }
        return sum;
    }


    public int sumOfDistinctElementsIn(LinkedList<Integer> set1, LinkedList<Integer> set2) {
        int sum1 = 0;
        int sum2 = 0;

        for (Integer element : set1) {
            if (!set2.contains(element)) {
                sum1 += element;
            }
        }

        for (Integer element : set2) {
            if (!set1.contains(element)) {
                sum2 += element;
            }
        }

        return sum1 + sum2;
    }
}
