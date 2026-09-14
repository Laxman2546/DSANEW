class Pair{
    int row;
    int col;
    int time;
    public Pair(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int [m][n];
        int cntFresh = 0;
        Queue<Pair> qu = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2 && vis[i][j] != 2){
                    qu.offer(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                if(grid[i][j] == 1)cntFresh++;
            }
        }
        int maxTime = 0;
        int countF = 0;
        while(!qu.isEmpty()){
            Pair val = qu.poll();
            int row = val.row;
            int col = val.col;
            int time = val.time;
            maxTime = Math.max(time,maxTime);
            int[] rowArr = {-1,0,1,0};
            int[] colArr = {0,-1,0,1};
            for(int k=0;k<4;k++){
                int l = row + rowArr[k];
                int o = col + colArr[k];
                if(l >= 0 && l < m && o >= 0 && o < n && grid[l][o] == 1 && vis[l][o] == 0){
                    qu.offer(new Pair(l,o,time+1));
                    vis[l][o] = 2;
                    countF++;
                }
            }
        }
            if(cntFresh != countF)return -1;
            return maxTime;
    }
}