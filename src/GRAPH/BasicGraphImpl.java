package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class BasicGraphImpl {

    List<List<Integer>> graph;
    int V; //number of nodes

    public BasicGraphImpl(int nodes){
        V = nodes;
        graph = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void printGraph(){
        for (int i = 0; i < V; i++) {
            System.out.print("Node " + i + ":");
            for(Integer x : graph.get(i)) System.out.print(" -> " + x);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        BasicGraphImpl graph = new BasicGraphImpl(5);
        graph.addEdge(0, 1);
        graph.addEdge(3, 2);
        graph.addEdge(2, 4);
        graph.addEdge(1, 4);
        graph.addEdge(3, 1);
        graph.addEdge(2, 0);
        graph.printGraph();
    }

}
