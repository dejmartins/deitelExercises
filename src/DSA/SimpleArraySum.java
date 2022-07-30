package DSA;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println(sumOfArray(arr));
    }

    private static int sumOfArray(List<Integer> arr) {
        return arr.stream().reduce(0, Integer::sum);
    }
}
