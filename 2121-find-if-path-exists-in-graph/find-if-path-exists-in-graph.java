class Solution {
    public boolean isValid(int s,int d,List<List<Integer>> ls,boolean[] vis){
        if(s == d) return true;
        Queue <Integer> qu = new LinkedList<>();
        qu.add(s);
        vis[s] = true;
        while(!qu.isEmpty()){
            int val = qu.poll();
            if(val == d) return true;
            for(int i=0;i<ls.get(val).size();i++){
                int neigh = ls.get(val).get(i);
                if(!vis[neigh]){
                    qu.offer(neigh);
                    vis[neigh] = true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length== 0 || source == destination)return true;
        int m = edges[0].length;
        boolean[] vis = new boolean[n];
        List<List<Integer>> ls  = new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            ls.get(u).add(v);
            ls.get(v).add(u);
        }
        return isValid(source,destination,ls,vis);
    }
}