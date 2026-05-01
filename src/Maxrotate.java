import java.util.Arrays;

public class Maxrotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maxRotateFunction(nums));
    }

    //class Solution {
    //    public int maxRotateFunction(int[] nums) {
    //        int n = nums.length;
    //        int totalSum = 0;
    //        int currentF = 0;
    //
    //        for (int i = 0; i < n; i++) {
    //            totalSum += nums[i];
    //            currentF += i * nums[i];
    //        }
    //
    //        int maxVal = currentF;
    //
    //        // Iterate backwards to simulate the rotations mathematically
    //        for (int i = n - 1; i > 0; i--) {
    //            // The formula to get the next rotation value in O(1)
    //            currentF = currentF + totalSum - n * nums[i];
    //            maxVal = Math.max(maxVal, currentF);
    //        }
    //
    //        return maxVal;
    //    }
    //}
    private static int maxRotateFunction(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return 0;
        int maxNum = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = calculateSum(nums);
            maxNum = Math.max(sum,maxNum);
            rotateArray(nums);
        }
        return maxNum;
    }

    private static int calculateSum(int[] nums) {
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            sum2+=nums[i] * i;
        }
        return sum2;
    }

    private static void rotateArray(int[] nums) {
        int len = nums.length;
        int last = nums[len-1];
        for (int i = nums.length -1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }
}
