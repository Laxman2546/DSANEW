import java.util.Arrays;

public class ProductOfMaxThree {
    public static void main(String[] args) {
        int[] nums = {-10,-110,20,5,8};
        System.out.println(maximumProduct(nums));
    }
        public static  int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length - 1;
            int firstNeg = Integer.MAX_VALUE;
            int secondNeg  = 1;
            for(int i=0;i<nums.length;i++){
                if(nums[i] < 0 && nums[i] < firstNeg){
                    secondNeg = firstNeg;
                    firstNeg = nums[i];
                }else if(nums[i] < 0 && nums[i] >= firstNeg && nums[i] <= secondNeg){
                    secondNeg = nums[i];
                }
            }
            int multi = (nums[n] * nums[n-1]) * nums[n - 2];
            int negMulti = (firstNeg == Integer.MAX_VALUE ? 0 :firstNeg * secondNeg) * nums[n];
            return Math.max(multi , negMulti);
        }

}
