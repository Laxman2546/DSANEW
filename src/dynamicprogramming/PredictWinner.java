package dynamicprogramming;

import java.util.Arrays;

public class PredictWinner {
    public static void main(String[] args) {
        int[] nums = {1,5,233,7};
        System.out.println(calculateWinner(nums));
    }

    public static boolean calculateWinner(int[] nums) {
        int[][] ans = new int[nums.length][nums.length];
        return  isWon(nums,0,nums.length-1,ans) >= 0;
    }
    public static  int  isWon(int[] nums,int st,int end,int[][] ans){
        if(st == end){
            return ans[st][end]=nums[st];
        }
        if(ans[st][end] != -1) return ans[st][end];
        int pickSt = nums[st] - isWon(nums,st+1,end,ans);
        int pickEnd = nums[end] - isWon(nums,st,end-1,ans);
        return ans[st][end] = Math.max(pickSt,pickEnd);
    }
}
