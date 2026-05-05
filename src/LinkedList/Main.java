package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Linked{
    private Node head;
    public void createLink(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
           temp = temp.next;
        }
        temp.next = node;
    }
    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp =  head;
        while (temp != null){
            System.out.print(temp.data);
            System.out.print("=>");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class Main {
    public static void main(String[] args) {
    Linked ls = new Linked();
    ls.createLink(12);
    ls.createLink(24);
    ls.createLink(36);
    ls.createLink(48);
    ls.display();
    }
}
