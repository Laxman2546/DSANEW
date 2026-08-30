class Solution {
    public int minimumDeletions(int[] nums) {
        int min =0;
        int max =0;
        int n = nums.length;
       for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[max]){
                max = i;
            }
            if(nums[i] < nums[min]){
                min = i;
            }
       }
       int smaller = Math.min(min,max);
       int larger = Math.max(min,max);
       int removeFront = larger + 1;
       int removeLast =  n - smaller;
       int removeBoth = (smaller + 1) + (n - larger);
        return Math.min(removeFront,Math.min(removeLast,removeBoth));
    }
}