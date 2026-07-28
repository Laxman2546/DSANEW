import java.util.Arrays;

public class GridPath {
    public static void main(String[] args) {
        int[][] grid = {{3,2,5},{1,4,6},{2,8,7}};
        System.out.println(maxSum(grid));
    }

    private static int  maxSum(int[][] grid) {
        int ans = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<grid[0].length;i++){
             ans = Math.max(ans,maxSumCal(grid,0,i,dp));
        }

        return ans;
    }

    private static int maxSumCal(int[][] grid, int row, int col,int[][] dp) {
        if(row == grid.length-1){
            return grid[row][col];
        }
        if(dp[row][col] != -1) return dp[row][col];
        int down = maxSumCal(grid,row+1,col,dp);
        int leftDiagnol = Integer.MIN_VALUE;
        if(col > 0){
            leftDiagnol = maxSumCal(grid,row+1,col-1,dp);
        }
        int rightDiagnol = Integer.MIN_VALUE;
        if(col < grid[0].length-1){
            rightDiagnol = maxSumCal(grid,row+1,col+1,dp);
        }
        return dp[row][col]=grid[row][col] + Math.max(down,Math.max(leftDiagnol,rightDiagnol));
    }
}
