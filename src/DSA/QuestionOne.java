package DSA;

public class QuestionOne {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 49, 87, 90, 39, 44, 23};

        int temp;
        int k = arr[0];

        for (int i = 0; i < arr.length; i++){
            temp = arr[i];
            arr[i] =  arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }

        for (int j = 0; j < arr.length; j++){
            if (k == arr[j]){
                System.out.printf("%d is now at position %d", k, j);
            }
        }
    }
}
