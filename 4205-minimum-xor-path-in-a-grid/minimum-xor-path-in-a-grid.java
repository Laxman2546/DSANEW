class Pair{
    int row;
    int col;
    int xVal;
    public Pair(int row,int col,int xVal){
        this.row = row;
        this.col = col;
        this.xVal = xVal;
    }
}
class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][][] vis = new boolean[m][n][1024];
        return solve(m,n,vis,grid,0,0);
    }
    public int solve(int m,int n,boolean[][][] vis,int[][] grid,int row,int col){
        Queue<Pair> qu  = new LinkedList<>();
        qu.add(new Pair(row,col,grid[0][0]));
        vis[0][0][0] = true;
        int minXor = Integer.MAX_VALUE;
        while (!qu.isEmpty()) {
            Pair curr = qu.poll();
            int r = curr.row;
            int c = curr.col;
            int xor = curr.xVal;
            
            // If we reached the bottom-right cell, update our minimum XOR
            if (r == m - 1 && c == n - 1) {
                minXor = Math.min(minXor, xor);
                continue; // Continue exploring to see if any other path gives a smaller XOR
            }
            
            // 1. Move Down (r + 1, c)
            if (r + 1 < m) {
                int nextXor = xor ^ grid[r + 1][c];
                if (!vis[r + 1][c][nextXor]) {
                    vis[r + 1][c][nextXor] = true;
                    qu.add(new Pair(r + 1, c, nextXor));
                }
            }
            
            // 2. Move Right (r, c + 1)
            if (c + 1 < n) {
                int nextXor = xor ^ grid[r][c + 1];
                if (!vis[r][c + 1][nextXor]) {
                    vis[r][c + 1][nextXor] = true;
                    qu.add(new Pair(r, c + 1, nextXor));
                }
            }
        }
        
        return minXor;
    }
}