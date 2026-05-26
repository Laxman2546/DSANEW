package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Subset2 {
    public static void main(String[] args) {
        int[] nums = {0,8,9,5,2};
        int target = 7;
        List<Integer> ls = new ArrayList<>();
        Boolean[][] dp = new Boolean[nums.length][target+1];
        System.out.println(subsetSum(nums,target,ls,0,dp));
    }

    private static Boolean subsetSum(int[] nums, int t,List<Integer> ls,int i,Boolean[][] dp) {
        if(i == nums.length){
            return t == 0;
        }
        if(dp[i][t] != null)return dp[i][t];
        Boolean skip = subsetSum(nums,t,ls,i+1,dp);
        if(nums[i] > t)return dp[i][t] = skip;
        Boolean pick = subsetSum(nums,t-nums[i],ls,i+1,dp);
        return  dp[i][t] = skip || pick;
    }
}
