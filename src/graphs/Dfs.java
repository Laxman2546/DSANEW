package graphs;

import java.util.ArrayList;

public class Dfs {
    public static  void  dfs(ArrayList<ArrayList<Integer>> graph){
        boolean[] vis = new boolean[graph.size()];
        int i = 0;
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        if(!vis[i]) {
            dfstraversal(graph, vis, i,res);
            count++;
        }
        System.out.println(count);
    }

    private static void countTraversal(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int i, int i1) {

    }

    private static void dfstraversal(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int i,ArrayList<Integer> res) {
        vis[i] = true;
        res.add(i);
        for(int gr : graph.get(i)){
        if(!vis[gr]){
        dfstraversal(graph,vis,gr,res);
          }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            graph.add(new ArrayList<>());
        }

// 0 -> 1
        graph.get(0).add(1);

// 1 -> 0
        graph.get(1).add(0);

// 2 -> []

// 3 -> 4
        graph.get(3).add(4);

// 4 -> 3
        graph.get(4).add(3);

        System.out.println(graph);
        dfs(graph);
    }
}
