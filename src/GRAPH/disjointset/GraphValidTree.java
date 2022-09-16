package GRAPH.disjointset;

public class GraphValidTree {

//    public static void main(String[] args) {
//        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
//        int n = 5;
//        UnionFindA uf = new UnionFindA(n);
//        for (int i = 0; i < edges.length; i++) {
//            uf.union(edges[i][0], edges[i][1]);
//        }
//
//        for (int i = 0; i < edges.length; i++) {
//            System.out.print(uf.find(edges[i][0]) + " ");
//            System.out.print(uf.find(edges[i][1]) + " ");
//            System.out.println(uf.isConnected(edges[i][0], edges[i][1]));
//        }
//    }

    public boolean validTree(int n, int[][] edges){
        UnionFindA uf = new UnionFindA(n);
        for (int i = 0; i < n; i++) {
            if(!uf.union(edges[i][0], edges[i][1])) return false;
        }

        return true;
    }

    static class UnionFindA{
        private final int[] root;

        public UnionFindA(int size){
            root = new int[size];

            for (int i = 0; i < size; i++) {
                root[i] = i;
            }
        }

        public int find(int vertex){
            if(vertex == root[vertex]) return vertex;
            return root[vertex] = find(root[vertex]);
        }

        public boolean union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);

            if(rootX == rootY){
                return false;
            }

            root[rootX] = rootY;
            return true;
        }

        public boolean isConnected(int x, int y){
            return find(x) == find(y);
        }
    }
}
