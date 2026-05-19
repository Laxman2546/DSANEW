package dynamicprogramming;

public class Climbstaris {
    public static void main(String[] args) {
    int n = 5;
    int[] dp = new int[n+1];
    int[] dp2 = new int[n+1];
    System.out.println(climbcount(n,dp));
    System.out.println(climbcounttab(n,dp2));
    }
    private static int climbcount(int n,int[] dp) {
        if(dp[n] != 0)return dp[n];
        if(n<3){
            return n;
        }
        return dp[n] = climbcount(n-1,dp) + climbcount(n-2,dp);
    }
    private static int climbcounttab(int n,int[] dp) {
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
