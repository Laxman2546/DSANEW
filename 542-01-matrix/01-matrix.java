class Pair{
    int row;
    int col;
    int val;
    public Pair(int row,int col,int val){
        this.row = row;
        this.col = col;
        this.val = val;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n =  mat[0].length;
        Queue<Pair> qu = new LinkedList<>();
        int[][] res = new int[m][n];
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    qu.offer(new Pair(i,j,0));
                    vis[i][j] = true;
                }
            }
        }
        int[] delRow = {1,0,-1,0};
        int[] delCol = {0,1,0,-1};
        while(!qu.isEmpty()){
            Pair data = qu.poll();
            int row = data.row;
            int col = data.col;
            int val = data.val;
            for(int k=0;k<4;k++){
                int x = row + delRow[k];
                int y = col + delCol[k];
                if(x>=0 && x<m && y>=0 && y<n && !vis[x][y]){
                    qu.add(new Pair(x,y,val+1));
                    res[x][y] = val + 1;
                    vis[x][y] = true;
                }
            }
        }
        return res;
    }
}