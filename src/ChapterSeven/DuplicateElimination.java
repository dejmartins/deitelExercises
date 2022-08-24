package ChapterSeven;

import java.util.Arrays;

public class DuplicateElimination {
    int[] arr;
    int count = 0;

    public DuplicateElimination(int[] arr) {
        Arrays.fill(arr, -1);
        this.arr = arr;
    }

    public String getArr() {
        removeDuplicates();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i: arr) {
            if (i > -1) stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }

    public void input(int input) {
        arr[count] = input;
        count++;
    }

    private void removeDuplicates(){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) arr[j] = -1;
            }
        }
    }
}
