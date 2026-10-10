/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findTilt(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        solve(root,res);
        int ans = 0;
        for(int ls : res){
            ans+= ls;
        }
        return ans;
    }
    public int solve(TreeNode root,List<Integer> res){
        if(root == null){
            return 0;
        }
        int left = solve(root.left,res);
        int right = solve(root.right,res);
        int val = Math.abs(left - right);
        res.add(val);
        root.val = root.val + left + right;
        return root.val;
    }
}