class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][]dp = new int[n][m];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }
        return distinct(s,t,0,0,n,m,dp);
    }
    public int distinct(String s,String t,int i,int j,int n,int m,int[][] dp){
       if(j == m)return 1;
       if(i == n)return 0;
       if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j)){
            return  dp[i][j]=distinct(s,t,i+1,j+1,n,m,dp) +  distinct(s,t,i+1,j,n,m,dp);
        }
            return  dp[i][j]=distinct(s,t,i+1,j,n,m,dp);
    }
}