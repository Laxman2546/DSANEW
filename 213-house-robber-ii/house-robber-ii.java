class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int first = solve(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int second = solve(nums,1,n,dp);
        return Math.max(first,second);
    }
    public int solve(int[] nums,int i,int end,int[] dp){
        if(i >= end) return 0;
        if(dp[i] != -1)return dp[i];
        int pick = nums[i] + solve(nums,i+2,end,dp);
        int skip = solve(nums,i+1,end,dp);
        return dp[i] = Math.max(pick,skip);
    }
}