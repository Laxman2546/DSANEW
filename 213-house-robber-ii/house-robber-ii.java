class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];
        int[] temp1 = Arrays.copyOfRange(nums,0,n-1);
        int[] temp2 = Arrays.copyOfRange(nums,1,n);
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int first = solve(temp1,0,dp);
        Arrays.fill(dp,-1);
        int second = solve(temp2,0,dp);
        return Math.max(first,second);
    }
    public int solve(int[] nums,int i,int[] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1)return dp[i];
        int pick = nums[i] + solve(nums,i+2,dp);
        int skip = solve(nums,i+1,dp);
        return dp[i] = Math.max(pick,skip);
    }
}