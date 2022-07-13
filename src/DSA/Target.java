package DSA;

import java.util.Arrays;

public class Target {
    public static void main(String[] args) {
        int[] nums = {0, 8, 3,11, 9};

        System.out.print(Arrays.toString(answer(nums, 9)));

    }

    public static int[] answer(int[] arr, int target){
        int[] index = new int[2];

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}
