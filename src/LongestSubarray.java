public class LongestSubarray {
    public static int subarraySum(int[] nums, int k) {
        int sum =nums[0];
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int n = nums.length;
        while(right < n){
            while(left <= right && sum > k){
                sum -= nums[left++];
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left+1);
            }
            right++;
            if(right < n){
                sum += nums[right];
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] longest = {10, 5, 2, 7, 1, 9};
        System.out.println(subarraySum(longest,15));

    }
}
