class Solution {
    public int findCenter(int[][] edges) {
        if(edges.length == 0)return 0;
        int n = edges.length + 1;
        List<List<Integer>> ls = new ArrayList<>();
       for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
       }
       for(int[] edge : edges){
        int u = edge[0];
        int v = edge[1];
        ls.get(v).add(u);
        ls.get(u).add(v);
       }
       for(int i=0;i<=n;i++){
            if(ls.get(i).size() == n - 1){
                return i;
            }
       }
       return -1;
    }
}