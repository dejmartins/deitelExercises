package GRAPH.kahnalgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {

    public static void main(String[] args) {
        int[][] pre = {{1, 0}};
        System.out.println(Arrays.toString(findOrder(2, pre)));
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];

        if(numCourses == 0) return result;
        if(prerequisites == null || prerequisites.length == 0){
            for (int i = 0; i < numCourses; i++) {
                result[i] = i;
            }
            return result;
        }

        int[] inDegree = new int[numCourses];
        Queue<Integer> zeroDegree = new LinkedList<>();

        for (int[] prerequisite : prerequisites) {
            inDegree[prerequisite[0]]++;
        }



        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i] == 0) zeroDegree.add(i);
        }

        if(zeroDegree.isEmpty()) return new int[0];

        int index = 0;
        while(!zeroDegree.isEmpty()){
            int course = zeroDegree.poll();
            result[index] = course;
            index++;

            for (int[] prerequisite : prerequisites) {
                if (prerequisite[1] == course) {
                    inDegree[prerequisite[0]]--;
                    if(inDegree[prerequisite[0]] == 0) zeroDegree.add(prerequisite[0]);
                }
            }
        }

        for(int in : inDegree){
            if(in != 0) return new int[0];
        }

        return result;
    }

}
