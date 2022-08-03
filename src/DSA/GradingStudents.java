package DSA;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(getRoundedGrades(grades));
    }

    private static List<Integer> getRoundedGrades(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38){
                int div = grades.get(i) / 5;
                int remainder = grades.get(i) % 5;
                if (remainder >= 3) grades.set(i, (div + 1) * 5);
            }
        }
        return grades;
    }
}
