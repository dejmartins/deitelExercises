package DSA;

public class HighestNumberIndex {
    public static void main(String[] args) {
        int[] num = {3, 12, 6, 8, 5, 9, 2};

        System.out.printf("The index of the highest number is %d", highest(num));

    }

    public static int highest(int[] num){
        int peak = num[0];
        int peakIndex = 0;

        for (int i = 1; i < num.length - 1; i++){
            if (num[i] > peak && num[i] > num[i + 1]) {
                peak = num[i];
                peakIndex = i;
            }
        }
        return peakIndex;
    }
}
