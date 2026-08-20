class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> left = new ArrayList<>(); 
        List<Integer> right = new ArrayList<>();
        left.add(nums[0]);
        right.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(left.get(left.size()-1) > right.get(right.size()-1)){
                left.add(nums[i]);
            }else{
                right.add(nums[i]);
            }
        } 
        int[] res = new int[nums.length];
        int l = 0;
        for(int j=0;j<left.size();j++){
            res[l++] = left.get(j);
        }       
        for(int k=0;k<right.size();k++){
            res[l++] = right.get(k);
        } 
        return res;      
    }
}