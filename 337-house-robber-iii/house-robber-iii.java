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
    public int rob(TreeNode root) {
        HashMap<TreeNode,Integer> dp = new HashMap<>();
        return solve(root,dp);
    }
    public int solve(TreeNode node,HashMap<TreeNode,Integer>dp){
        if(node == null) return 0;
        if(dp.containsKey(node))return dp.get(node); 
        int pick = node.val;
        if(node.left != null){
            pick += solve(node.left.left,dp);
            pick += solve(node.left.right,dp);
        } 
        if(node.right != null){
            pick += solve(node.right.left,dp);
            pick += solve(node.right.right,dp);
        };
        int skip = solve(node.left,dp) + solve(node.right,dp);
        int maxRob = Math.max(pick,skip);
        dp.put(node,maxRob);
        return maxRob;
    }
}