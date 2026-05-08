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

public class Main {
    public static void main(String[] args) {
        Binary bin = new Binary();
        bin.createNode();
        bin.display();
    }
}
