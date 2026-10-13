/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p,q);
    }
    public TreeNode lca(TreeNode r,TreeNode p,TreeNode q){
        if(r == null)return null;
        if(r.val == p.val)return r;
        if(r.val == q.val)return r;
        TreeNode left = lca(r.left,p,q);
        TreeNode right = lca(r.right,p,q);
        if(left != null && right != null)return r;
        return left != null ? left : right;
    }
}