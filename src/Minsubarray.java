public class Minsubarray {
    public static  int minSubArrayLen(int target, int[] nums) {
       if(nums == null || nums.length == 0){
           return  0;
       }
        int length = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                length=Math.min(length , i- left+ 1 );
                sum -= nums[left];
                left++;
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length ;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }

}
