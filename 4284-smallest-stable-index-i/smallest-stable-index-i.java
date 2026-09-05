class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length <= 1) return 0;
        int[] minSuff = new int[nums.length];
        int n = nums.length;
        minSuff[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            minSuff[j] = Math.min(nums[j],minSuff[j+1]);
        }
        int maxPre = 0;
        for(int m=0;m<nums.length;m++){
            maxPre = Math.max(nums[m],maxPre);
            int instability  = maxPre - minSuff[m];
            if(instability  <= k){
                return m;
            }
        }
        return -1;
    }
}