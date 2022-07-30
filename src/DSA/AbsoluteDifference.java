package DSA;

import java.util.ArrayList;
import java.util.List;

public class AbsoluteDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        a.add(11);
        a.add(2);
        a.add(4);

        b.add(4);
        b.add(5);
        b.add(6);

        c.add(10);
        c.add(8);
        c.add(-12);

        arr.add(a);
        arr.add(b);
        arr.add(c);


        System.out.println(getAbsoluteDiff(arr));
    }

    private static int getAbsoluteDiff(List<List<Integer>> arr) {
        int sumToTheRight = 0;
        int sumToTheLeft = 0;
        for (int i = 0; i < arr.size(); i++){
            sumToTheRight += arr.get(i).get(i);
            sumToTheLeft += arr.get(i).get(arr.size() - (i+1));
        }
        return Math.abs(sumToTheRight - sumToTheLeft);
    }


}
