package DSA;

import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {

    public int getSize(List<Integer> a) {
        int[] frequency = new int[101];
        int size = 0;

        for (Integer integer : a) {
            frequency[integer]++;
        }

        for (int i = 0; i < frequency.length - 1; i++) {
            size = Math.max(size, Math.abs(frequency[i] + frequency[i + 1]));
        }

        return size;
    }
}
