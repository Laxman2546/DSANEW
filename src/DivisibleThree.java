public class DivisibleThree {
    public static int maxSumDivThree(int[] nums) {
        int maxSum = 0;
        int secondMax = 0;
        for(int i=0; i<nums.length;i++) {
            maxSum += nums[i];
        }
        int value = maxSum%3;
        for(int i=0;i<nums.length;i++){
            if(i % 3 == value){
                secondMax = maxSum-i;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,5,1,8};
        int num = maxSumDivThree(nums);
        System.out.println(num);
    }
}
