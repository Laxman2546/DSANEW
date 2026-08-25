class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        boolean isTrue = true;
        int multiple = k;
        while(isTrue){
            if(!hs.contains(multiple)){
                return multiple;
            }
            multiple+=k;
        }
        return k;
    }
}