class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffixSum = new int[n];
        int[][] dp = new int[n][n+1];
        suffixSum[n-1] = piles[n-1];
        for(int i=n-2;i>=0;i--){
            suffixSum [i] = suffixSum[i+1]+piles[i];
        }
        return predict(piles,dp,0,1,suffixSum);
    }
    public int predict(int[] piles,int[][] dp,int i,int m,int[] suffixSum){
        int n = piles.length;
        if(i>=n){
            return 0;
        }
        if(n - i <= 2 * m)return suffixSum[i];
        if(dp[i][m] != 0)return dp[i][m];
        int maxStones = 0;
        for(int x = 1;x<=2*m;x++){
            int opp = predict(piles,dp,i+x,Math.max(m,x),suffixSum);
            maxStones = Math.max(maxStones,suffixSum[i] - opp);
        }
        return dp[i][m] = maxStones;
    }
}