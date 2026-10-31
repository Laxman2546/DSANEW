class Solution {
    int m = 0;
    int n = 0;
    int left = 0;
    int up = 1;
    int MOD = 1000000007;
    Integer[][][] dp;
    public int uniquePaths(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        dp = new Integer[m][n][2];
        return solve(grid,0,0,left);
    }
    public int solve(int[][] grid,int i,int j,int came){
        if(i>=m || j>=n)return 0;
        if(i==m-1 && j== n-1)return 1;
        if(dp[i][j][came] != null) return dp[i][j][came];
        if(grid[i][j] == 1){
            if(came == left){
                return solve(grid,i+1,j,up);
            }else{
                return solve(grid,i,j+1,left);
            }
        }
            int totalWays = 0;
            totalWays = (totalWays+solve(grid,i+1,j,up))%MOD;
            totalWays =(totalWays+solve(grid,i,j+1,left))%MOD;
            return dp[i][j][came] = (int)totalWays;
    }
}