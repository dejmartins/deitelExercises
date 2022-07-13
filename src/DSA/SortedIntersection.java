package DSA;

import java.util.Arrays;

public class SortedIntersection {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 6, 7, 0, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 6, 8, 10};

        System.out.println(Arrays.toString(merge(nums1, nums2)));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int pos = 0;
        for (int i = arr1.length - 1; i >= arr2.length; i--) {
            arr1[i] = arr2[pos];
            pos++;
        }

        sort(arr1);
        return arr1;
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
