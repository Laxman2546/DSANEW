import java.util.Arrays;

public class LeftRightSum {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
        System.out.println(Arrays.toString(optimized(nums)));
    }
//bruteforece
    private static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] suffix = new int[n];
        int[] prefix = new int[n];
        int totalSum = nums[0];
        for(int i=1;i<nums.length;i++){
            totalSum+= nums[i];
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            suffix[i] = totalSum - nums[i];
            totalSum = suffix[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i] = Math.abs(suffix[i] - prefix[i]);
        }
        return res;
    }
    private static  int[] optimized(int[] nums){
        int leftSum = 0,rightSum = 0;

        for(int num : nums){
            rightSum+= num;
        }
        int[] res = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            rightSum -= nums[i];
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return res;
    }
}
