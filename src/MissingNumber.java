public class MissingNumber {
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int natural = n * (n+1)/2;
        int sum =0;
        for(int i =0 ;i<nums.length;i++){
            sum += nums[i];
        }
        return  natural - sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,3};
        System.out.println( missingNumber(nums));
    }
}
