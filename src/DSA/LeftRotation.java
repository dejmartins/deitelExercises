package DSA;

import java.util.List;

public class LeftRotation {

    public List<Integer> rotateLeft(int d, List<Integer> arr) {
        for (int i = 0; i < d; i++) {
            arr.add(arr.subList(0, d).get(i));
        }
        arr.subList(0, d).clear();
        return arr;
    }
}
