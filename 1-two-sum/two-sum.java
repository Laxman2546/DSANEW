class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tar = target - nums[i];
            if(hs.containsKey(tar)){
                res[0] = i;
                res[1] = hs.get(tar);
            } else{
                hs.put(nums[i],i);
            }
        }
        return res;
    }
}