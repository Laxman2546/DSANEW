import java.util.Arrays;

public class Fibonaaci {
    public static void main(String[] args) {
        int n = 18;
        int[] dp = new int[n+1];
        int ans = fibtab(n,dp);
        System.out.println(Arrays.toString(dp));
        System.out.println(ans);
    }
    private static int fibo(int n,int[] dp) {
        if(n < 2){
            return n;
        }
        if(dp[n] != 0)return dp[n];
        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
    }
    private static int fibtab(int n,int[] dp){
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
