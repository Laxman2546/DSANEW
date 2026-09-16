class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int preFix = 1;
        int suffix = 1;
        for(int i=0;i<n;i++){
            preFix *= nums[i];
            suffix  *= nums[n - 1 -i];
            max = Math.max(max,Math.max(preFix,suffix));
            if(preFix == 0)preFix = 1;
            if(suffix == 0)suffix = 1;
        }
        return max;
    }
}