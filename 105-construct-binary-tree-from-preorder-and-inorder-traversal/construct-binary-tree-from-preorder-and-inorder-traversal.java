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
    Integer idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
     
        return solve(preorder,inorder,0,n-1,n);
    }
    public TreeNode solve(int[] preorder, int[] inorder,int start,int end,int n){
        if(start > end)return null;
        int val = preorder[idx];
        int i = start;
        for(;i<=end;i++){
            if(inorder[i] == val){
               break;
            }
        }
        idx++;
        TreeNode root = new TreeNode(val);
        root.left = solve(preorder,inorder,start,i-1,n);
        root.right = solve(preorder,inorder,i+1,end,n);
        return root;
    }
}