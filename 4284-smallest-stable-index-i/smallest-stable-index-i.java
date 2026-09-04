class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // if(nums.length <= 1) return 0;
        int[] maxPre = new int[nums.length];
        int[] minSuff = new int[nums.length];
        int n = nums.length;
        maxPre[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            maxPre[i] = Math.max(nums[i],maxPre[i-1]);
        }
        
        minSuff[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            minSuff[j] = Math.min(nums[j],minSuff[j+1]);
        }
        System.out.println(Arrays.toString(maxPre));
        System.out.println(Arrays.toString(minSuff));
        int bestK = -1;
        for(int m=0;m<nums.length;m++){
            int instability  = maxPre[m] - minSuff[m];
            if(instability  <= k){
                return m;
            }
        }
        return bestK;
    }
}