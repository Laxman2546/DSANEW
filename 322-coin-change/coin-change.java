class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length; 
        int[][] dp = new int[n][amount+1];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }
        int ans =  solve(coins,amount,coins.length-1,dp);
        return ans == Integer.MAX_VALUE?-1:ans;
    }
    public int solve(int[] coins,int amount,int i,int[][] dp){
        if(i == 0){
            if(amount % coins[i] == 0){
                return amount/coins[i];
            }
            return Integer.MAX_VALUE;
        }
        if(dp[i][amount] != -1)return dp[i][amount];
        int skip = solve(coins,amount,i-1,dp);
        int take = Integer.MAX_VALUE;
        if(coins[i] <= amount){
            int res =  solve(coins,amount-coins[i],i,dp);
            if(res != Integer.MAX_VALUE){
                 take = 1 + res;
            }
        }
        return dp[i][amount] =  Math.min(skip,take);
    }

}