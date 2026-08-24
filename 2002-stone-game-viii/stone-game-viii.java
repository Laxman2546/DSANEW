class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = stones[0];
        for(int i=1;i< n;i++){
            prefixSum[i] = stones[i] + prefixSum[i-1];
        }
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MIN_VALUE);
        return dfs(1,prefixSum,dp,n);
    }
    public int dfs(int idx,int[] pre,int[] dp, int n){
        if(idx >= n - 1){
            return pre[idx];
        }
        if(dp[idx] == Integer.MIN_VALUE){
        int skip = dfs(idx+1,pre,dp,n);
        int take = pre[idx] - dfs(idx+1,pre,dp,n);
        return dp[idx] = Math.max(skip,take);
        }
        return dp[idx]; 
    }
}