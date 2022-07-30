package DSA;

import java.util.*;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(17);
        a.add(28);
        a.add(30);

        b.add(99);
        b.add(16);
        b.add(8);
        System.out.println(getRating(a, b));
    }

    private static List<Integer> getRating(List<Integer> pointA, List<Integer> pointB) {
        List<Integer> grading = new ArrayList<>();
        grading.add(0);
        grading.add(0);

        for (int i = 0; i < pointA.size(); i++){
            if (pointA.get(i) > pointB.get(i)) grading.set(0, grading.get(0) + 1);
            else if (pointA.get(i) < pointB.get(i)) grading.set(1, grading.get(1) + 1);
        }

        return grading;
    }
}
