package recursion;

public class Robot {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] dp  = new int[m+1][n+1];
        System.out.println(countpath(m,n,dp));
    }

    public  static int countpath (int r, int c,int[][] dp) {
        if(r == 1 || c==1){
            return 1;
        }
        if(dp[r][c] != 0){
            return dp[r][c];
        }
        int left = countpath(r-1,c,dp);
        int right = countpath(r,c-1,dp);
        return dp[r][c] = left + right;
    }
}
