package GRAPH.disjointset;

import java.util.*;

public class ConnectedComponents {

    public static void main(String[] args) {
        int[][] edges = {{2, 3}, {1, 2}, {1, 3}};
        System.out.println(countComponent(5, edges));
    }

    public static int countComponent(int n, int[][] edges){
        Map<Integer, List<Integer>> graph = edgesToGraph(edges);
        List<Integer> visited = new ArrayList<>();
        int count = 0;
        for(Integer key : graph.keySet()){
            if(exploreGraph(graph, key, visited)) count++;
        }
        return count;
    }

    private static boolean exploreGraph(Map<Integer, List<Integer>> graph, int key, List<Integer> visited) {
        List<Integer> stack = new ArrayList<>();
        if(visited.contains(key)) return false;
        stack.add(key);

        while (stack.size() > 0){
            int current = stack.remove(stack.size() - 1);
            if(!visited.contains(current)){
                stack.addAll(graph.get(current));
            }
            visited.add(current);
        }
        return true;
    }

    private static Map<Integer, List<Integer>> edgesToGraph(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            if(!graph.containsKey(edges[i][0])){
                graph.put(edges[i][0], new ArrayList<>());
            }

            if(!graph.containsKey(edges[i][1])){
                graph.put(edges[i][1], new ArrayList<>());
            }

            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        System.out.println(graph);
        return graph;
    }

}
