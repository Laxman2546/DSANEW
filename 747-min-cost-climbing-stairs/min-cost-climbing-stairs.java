class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int one = solve(cost,0,n,dp);
        Arrays.fill(dp,-1);
        int two = solve(cost,1,n,dp);
        return Math.min(one,two);
    }
    public int solve(int[] cost,int i,int n,int[] dp){
        if(i  >= n){
            return 0;
        }
        if(dp[i] != -1)return dp[i];
        int oneStep = cost[i] + solve(cost,i+1,n,dp);
        int secStep = cost[i] + solve(cost,i+2,n,dp);
        return dp[i] = Math.min(oneStep,secStep); 
    }
}
