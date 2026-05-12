package trees;

import java.util.InputMismatchException;
import java.util.Scanner;

class Binary{
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
          this.value = value;
        }
    }
    private Node root;
    public void createNode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the root value");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }

    public void populate(Scanner sc, Node node) {
        try{
        System.out.println("Do you want to insert on the node left"+ " " + node.value);
        boolean left = sc.nextBoolean();
            if(left){
                System.out.println("Enter the Value for the left" + " " + node.value);
                int leftvalue = sc.nextInt();
                node.left = new Node(leftvalue);
                populate(sc,node.left);
            }
        }catch (InputMismatchException e){
            System.out.println("please enter the boolean true or false left of" + node.value);
            sc.nextLine();
        }

        System.out.println("Do you want to insert on the node right"+ " " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the Value for the right"+ " " + node.value);
            int rightVal = sc.nextInt();
            node.right = new Node( rightVal);
            populate(sc,node.right);
        }
    }
    public void display(){
        prettydisplay(root,0);
    }

    private void prettydisplay(Node node, int level) {
        if(node == null){
            return;
        }
        prettydisplay(node.right,level+ 1);
        if(level !=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        }else{
            System.out.println(node.value);
        }
        prettydisplay(node.left,level+1);
    }

    private void display(Node node,String space){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        display(node.left , " ");
        display(node.right, " ");
    }
}
class Tree{
    class Node{
        int value;
        Node left;
        Node right;
        public  Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void addNode(int value){
        root = addEle(root,value);
    }
    private Node addEle(Node node, int value) {
        if(node == null){
           node = new Node(value);
           return node;
        }
        if(value < node.value){
            node.left = addEle(node.left,value);
        }else{
            node.right = addEle(node.right,value);
        }
        return  node;
    }
    public void populate(int[] nums){
        populate(nums,0,nums.length);
    }
    public void populate(int[] nums,int st,int end){
        if(st >= end){
            return;
        }
        int mid = st+ (end - st) /2;
        addNode(nums[mid]);
        populate(nums,st,mid);
        populate(nums,mid+1,end);
    }
    public void display(){
        prettyDispaly(this.root,"this is root node");
    }
    public void preOrder(){
        preOrder(root);
    }
    public  void  preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    public  void  postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }
    public void inOrder(){
        inOrder(root);
    }
    public  void  inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }
    private void prettyDispaly(Node node,String details) {
        if(node == null){
            return;
        }
        System.out.println(details+" "+node.value);
        prettyDispaly(node.left,"left node of value"+node.value);
        prettyDispaly(node.right,"right node of value" + node.value);

    }
}
public class Main {
    public static void main(String[] args) {
//        Binary bin = new Binary();
//        bin.createNode();
//        bin.display();
        Tree tr = new Tree();
        int[] nums = {3,5,2,1,4,6,7};
        tr.populate(nums);
        tr.display();
    }
}
