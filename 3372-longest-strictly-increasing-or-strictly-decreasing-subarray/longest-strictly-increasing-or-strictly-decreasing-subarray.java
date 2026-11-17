class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increaseLength = 1;
        int maxIncrease = 1;
        int decreaseLength = 1;
        int maxDecrease = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                increaseLength++;
            }else{
                increaseLength = 1;
            }
            maxIncrease = Math.max(maxIncrease,increaseLength);
        }
        for(int j=0;j<nums.length-1;j++){
            if(nums[j] > nums[j+1]){
                decreaseLength++;
            }else{
                decreaseLength = 1;
            }
            maxDecrease = Math.max(maxDecrease,decreaseLength);
        }
        return Math.max(maxDecrease,maxIncrease);
    }
}