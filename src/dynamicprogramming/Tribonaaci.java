package dynamicprogramming;

import java.util.Arrays;

public class Tribonaaci {
    public static void main(String[] args) {
        int n = 26;
        int[] dp = new int[n+1];
        printTribo(n,dp);

    }

    private static void printTribo(int n,int[] dp){
        for(int i=1;i<=n;i++){
            System.out.print(tribona(i,dp) + " ");
        }
        System.out.println();
        System.out.println("----------------");
//        for(int i=1;i<=n;i++){
//            System.out.print(fib(i)+ " ");
//        }
    }
    private static int tribona(int n,int[] dp) {
        if(dp[n] != 0) return  dp[n];
        if(n<3){
            return 0;
        }
        if(n==3){
            return 1;
        }
        return dp[n] = tribona(n-1,dp)+tribona(n-2,dp)+tribona(n-3,dp);
    }
    private static int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
