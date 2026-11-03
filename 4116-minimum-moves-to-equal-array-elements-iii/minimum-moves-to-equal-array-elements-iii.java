class Solution {
    public int minMoves(int[] nums) {
        int maxEle = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > maxEle){
                maxEle = nums[i];
            }
        }
        int moves = 0;
        for(int i=0;i<nums.length;i++){
            moves +=maxEle - nums[i];
        }
        return moves;
    }
}