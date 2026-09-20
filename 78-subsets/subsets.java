class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        solve(nums,0,res,ls);
        return res; 
    }
    public void solve(int[] nums,int i,List<List<Integer>> res,List<Integer> ls){
        if(i  >= nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[i]);
        solve(nums,i+1,res,ls);
        ls.remove(ls.size() - 1);
        solve(nums,i+1,res,ls);
    }
}