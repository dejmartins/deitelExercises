package DSA;

import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 3, 4, 1, 5};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }


    public static int[] intersection(int[] arr1, int[] arr2){
        int[] intersect = new int[arr1.length + arr2.length];

        for (int i = 0; i < intersect.length; i++){
            if(i < arr1.length) intersect[i] = arr1[i];
            if(i < arr2.length) intersect[intersect.length - (i + 1)] = arr2[i];
        }

        return intersect;
    }
}
