package dynamicprogramming;

import java.util.Arrays;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        StringBuilder sb1 = new StringBuilder(text1);
        StringBuilder sb2 = new StringBuilder(text2);
        int[][] dp = new int[m][n];
        for(int[] num : dp){
            Arrays.fill(num,-1);
        }
        return common(m-1,n-1,sb1,sb2,dp);
    }
    public int common(int m,int n,StringBuilder s1,StringBuilder s2,int[][] dp){
        if(m<0 || n < 0){
            return 0;
        }
        if(dp[m][n] != -1) return dp[m][n];
        if(s1.charAt(m) == s2.charAt(n)){
            return dp[m][n]= 1+ common(m-1,n-1,s1,s2,dp);
        }else{
            return dp[m][n]= Math.max(common(m-1,n,s1,s2,dp),common(m,n-1,s1,s2,dp));
        }

    }
}
public class LCS {
    public static void main(String[] args) {

    }

}
