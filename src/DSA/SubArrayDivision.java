package DSA;

import java.util.List;

public class SubArrayDivision {

    public int getNumberOfSegments(List<Integer> chocolates, int day, int month) {
        int size = chocolates.size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (chocolates.size() >= month) {
                int sum = chocolates.subList(0, month).stream().mapToInt(x -> x).sum();
                if (sum == day) count++;
                chocolates.remove(0);
            } else break;
        }
        return count;
    }
}
