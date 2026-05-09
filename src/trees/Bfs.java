package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void addNode(int value){
        root = addElements(root,value);
    }
    private Node addElements(Node node , int value) {
        if(node== null){
           node =  new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = addElements(node.left,value);
        }else if(value > node.value){
            node.right = addElements(node.right,value);
        }
        return node;
    }
    public void populate(int[] nums){
        if(nums.length == 0){
            return;
        }
        for(int i=0;i<nums.length;i++){
            addNode(nums[i]);
        }
    }
    public void display(){
        if(root == null){
            return;
        }
        display("iam root node: ",root);
    }
    public void display(String value, Node node) {
        if (node == null) {
            return;
        }
        System.out.println(value + node.value);
        display("iam left of node " + node.value+ ": " ,node.left);
        display("iam right of node " + node.value+ ": ", node.right);
    }
    public void bfs(){
        System.out.println(root);
        List<List<Integer>> ls = bfsTraversal(root);

        System.out.println(ls);
    }
    private List<List<Integer>> bfsTraversal(Node node) {
        List<List<Integer>> res = new ArrayList<>();
        if(node == null){
            return  res;
        }
        Queue<Node> qu = new LinkedList<>();
        qu.offer(node);
        while(!qu.isEmpty()){
            List<Integer> cl = new ArrayList<>();
            int level = qu.size();
            for(int i=0;i<level;i++){
                Node current = qu.poll();
            if(current.left != null){
                qu.offer(current.left);
            }
            if(current.right!= null){
                qu.offer(current.right);
            }
            cl.add(current.value);
        }
            res.add(cl);
        }
        return res;
    }
}
class Main2{
    public static void main(String[] args) {
        Bfs bf = new Bfs();
        int[] nums = {5,6,4,2,1,3,7};
        bf.populate(nums);
        bf.bfs();
        bf.display();
    }
}
