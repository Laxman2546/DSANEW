public class MaximumTotal {
    public static void main(String[] args) {
       int[] nums = {4,2,5,1};
       int k = 3;
       long ans = maxTotalValue(nums,k);
        System.out.println(ans);
    }
    public static long maxTotalValue(int[] nums, int k) {
        long minNum = Integer.MAX_VALUE;
        long maxNum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > maxNum){
                minNum = maxNum;
                maxNum = nums[i];
            }
            if(nums[i] < maxNum && nums[i] > minNum){
                minNum = nums[i];
            }
        }
        return (maxNum - minNum) * k;
    }
}
