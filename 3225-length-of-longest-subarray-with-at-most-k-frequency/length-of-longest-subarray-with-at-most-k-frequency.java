class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       int left = 0;
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while(hm.get(nums[j]) > k){
                hm.put(nums[left],hm.get(nums[left])-1);
                left++;
            }
            ans = Math.max(ans,j - left  + 1);
        }
        return ans;
    }
}