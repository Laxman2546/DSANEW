class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;
        int[] delRow = {0,1,-1,0};
        int[] delCol = {-1,0,0,1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    count++;
                    solve(grid,vis,i,j,delRow,delCol,m,n);
                }
            }
        }
        return count;
    }
    private void solve(char[][] grid,boolean[][] vis,int ro,int co,int[] delRow,int[]delCol,int m,int n){
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(ro,co));
        vis[ro][co] = true;
        while(!qu.isEmpty()){
            Pair data = qu.poll();
            int row = data.row;
            int col = data.col;
            for(int i=0;i<4;i++){
                int r = row + delRow[i];
                int c = col + delCol[i];
                if(r>=0 && r < m && c>=0 && c < n && !vis[r][c] && grid[r][c] == '1'){
                    vis[r][c] = true;
                    qu.add(new Pair(r,c));
                }
            }
        }  
    }
}