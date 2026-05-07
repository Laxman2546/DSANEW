import java.util.Arrays;

public class Mincostclimb {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(mincost(cost));
    }


    private static int mincost(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
//        Arrays.fill(dp,-1);
        return  Math.min(mincosrdptab(cost,n-1,dp),mincosrdptab(cost,n-2,dp));
    }
    private static int minicost(int[] cost, int idx) {
        if(idx == 1 || idx == 0){
            return cost[idx];
        }
        return cost[idx] + Math.min(minicost(cost,idx-1),minicost(cost,idx-2));
    }
    private static int mincostdp(int[] cost,int idx,int[] dp){
        if(idx == 1 || idx ==0){
            return cost[idx];
        }
        if(dp[idx] != -1) return dp[idx];
        return  cost[idx] + Math.min(mincostdp(cost,idx-1,dp),mincostdp(cost,idx-2,dp));
    }
    private static int mincosrdptab(int[] cost,int idx,int[] dp){
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        System.out.println(Arrays.toString(dp));
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
