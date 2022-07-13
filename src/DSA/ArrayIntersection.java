package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }


    public static Object[] intersection(int[] arr1, int[] arr2){

        List<Integer> intersect = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j : arr2) {
                if (arr1[i] == j) {
                    intersect.add(j);
                    arr1[i] = 0;
                }
            }
        }

        return intersect.toArray();
    }
}
