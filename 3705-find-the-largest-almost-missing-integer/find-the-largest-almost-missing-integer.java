class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        if (k == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (hs.get(nums[i]) == 1) {
                    max = Math.max(nums[i], max);
                }
            }
            return max == Integer.MIN_VALUE ? -1 : max;
        } else if (k == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(nums[i], max);
            }
            return max;
        }else{
            int n = nums.length;
            if(hs.get(nums[0]) == 1 && hs.get(nums[n - 1])== 1){
                return Math.max(nums[0],nums[n-1]);
            }else if(hs.get(nums[0])==1){
                return nums[0];
            }else if(hs.get(nums[n-1])==1){
                return nums[n-1];
            }else{
                return -1;
            }
        }
    }
}