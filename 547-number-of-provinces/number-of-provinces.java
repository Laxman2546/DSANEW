class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                bfs(isConnected,vis,i,n);
                count++;
            }
        }
        return count;
    }
    public void bfs(int[][] connected,boolean[] vis,int i,int n){
        vis[i] = true;
        Queue<Integer> qu = new LinkedList<>();
        qu.add(i);
        while(!qu.isEmpty()){
            int j = qu.poll();
            for(int k=0;k<n;k++){
                if(!vis[k] && connected[k][j] == 1){
                    qu.add(k);
                    vis[k] = true;
                }
            }
        }
    }
}