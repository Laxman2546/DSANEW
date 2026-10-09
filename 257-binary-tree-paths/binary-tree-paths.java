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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        StringBuilder sb  = new StringBuilder();
        solve(root,res,sb);
        return res;
    }
    public void solve(TreeNode root,List<String>res,StringBuilder sb){
            if(root == null)return;
            int len = sb.length();
            if(root.left == null && root.right == null){
                sb.append(root.val);
                res.add(sb.toString());
            }
            sb.append( root.val+"->");
            solve(root.left,res,sb);
            solve(root.right,res,sb);
            sb.setLength(len);
    }
}