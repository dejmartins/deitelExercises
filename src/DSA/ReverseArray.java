package DSA;

import java.util.List;

public class ReverseArray {

    public List<Integer> reverseArray(List<Integer> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - (i + 1)));
            arr.set(arr.size() - (i + 1), temp);
        }
        return arr;
    }
}
