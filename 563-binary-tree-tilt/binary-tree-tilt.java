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
    int res = 0;
    public int findTilt(TreeNode root) {
        solve(root);
        return res;
    }
    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        int val = Math.abs(left - right);
        res += val;
        root.val = root.val + left + right;
        return root.val;
    }
}