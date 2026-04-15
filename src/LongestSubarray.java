public class LongestSubarray {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if((sum+nums[i]) <= k ){
                sum+= nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] longest = {1,1,1};
        System.out.println(subarraySum(longest,3));

    }
}
