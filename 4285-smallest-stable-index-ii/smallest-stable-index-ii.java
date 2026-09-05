class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minSuff = new int[n];
        minSuff[n-1]  = nums[n-1];
        for(int i=n-2;i>=0;i--){
            minSuff[i] = Math.min(minSuff[i+1],nums[i]); 
        }
        int max = Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            max = Math.max(nums[j],max);
            int instability = max - minSuff[j];
            if(instability <= k){
                return j;
            }
        }
        return -1;
    }
}