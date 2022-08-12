package DSA;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    public List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        int x = 0;

        for (int i = 0; i < queries.size(); i++) {
            int idx = (queries.get(i).get(1) ^ lastAnswer) % n;
            int y = queries.get(i).get(queries.get(i).size() - 1);

            if(queries.get(i).get(0) == 1){
                arr.get(idx).add(y);
            } else if (queries.get(i).get(0) == 2){
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                answer.add(lastAnswer);
            }
            x++;
            if(x > n - 1) x = 0;
        }
        return answer;
    }
}
