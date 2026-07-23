public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {-3,0,1,-2};
        System.out.println(maxProduct(nums));
    }

    private static int maxProduct(int[] nums) {
        int max = 0;
        int left = 1, right = 1;
        int leftp = 0, rightp = nums.length - 1;
        while (leftp < nums.length) {
                left = (left == 0 ?  1 :  left )* nums[leftp];
                right = (right == 0 ? 1  :  right) * nums[rightp];
                max = Math.max(max, Math.max(left, right));
                leftp++;
                rightp--;
        }

        return max;
    }

}
