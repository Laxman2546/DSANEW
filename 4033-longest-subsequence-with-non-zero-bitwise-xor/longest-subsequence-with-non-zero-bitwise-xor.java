class Solution {
    public int longestSubsequence(int[] nums) {
        int count = 0;
        int total = 0;
        for(int num : nums){
            total ^= num;
            if(num == 0) count++;
        }
        if(count == nums.length)return 0;
        if(total != 0){
            return nums.length;
        }
        return nums.length-1;
    }
}