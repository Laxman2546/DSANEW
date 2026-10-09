/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;
        List<Integer> rootChild = new ArrayList<>();
        rootChild.add(root.val);
        ans.add(rootChild);
        level(root,ans);
        ans.remove(ans.size()-1);
        return ans;
    }   
    private void level(Node node,List<List<Integer>> ans){
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> childNode = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node treeNode = qu.poll();
                for(Node child : treeNode.children){
                    int childVal = child.val;
                    childNode.add(childVal);
                    qu.add(child);  
                }
            }
            ans.add(childNode);
        }
    }
}