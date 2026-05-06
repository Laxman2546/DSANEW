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
    public void display2(Node head2){
        if(head2 == null){
            System.out.println("List is empty");
            return;
        }
        Node temp =  head2;
        while (temp != null){
            System.out.print(temp.data);
            System.out.print("=>");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public Node reverseLL(){
        if(head == null){
            return null;
        }
        Node prev = null;
        while(head != null){
            Node temp = head;
            head= head.next;
            temp.next = prev;
            prev = temp;
        }
        head = prev;
        return head;
    }
    public Node reverseLL2(Node head,int k){
        if(head == null){
            return null;
        }
        Node temp = head;
        int length = 0;
        while(temp != null){
            length+= 1;
            temp = temp.next;
        }
        k = k % length;
        if(k == 0) return  head;
        Node slow = head,fast = head;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        while(fast.next !=null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        display2(head);
        return head;

    }
    public Node rotateRight(Node head,int k){
        if(head == null){
            return null;
        }
        reverseLL2(head,k);
        return head;
    }

}

public class Main {
    public static void main(String[] args) {
    Linked ls = new Linked();
    ls.createLink(12);
    ls.createLink(24);
    ls.createLink(36);
    ls.createLink(48);
    ls.createLink(50);
    ls.display();
    Node newHead = ls.reverseLL();
    ls.display2(newHead);
    Node newHead2 = ls.reverseLL2(newHead,3);
    }
}
