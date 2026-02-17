class Node{
     int data;
     Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public  Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    public   void displayNode() {
        System.out.println(data);
    }

}

 class LL{
    private Node head;
    public  void insertFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;

    }
     public void Display() {
         if (head == null) {
             System.out.println("List is empty");
             return;
         }
         Node current = head;
         while (current != null) {
             System.out.print(current.data + "=>");
             current = current.next;
         }
         System.out.println("null");
     }
    public void ReverseLL(){
        Node current = head;
        Node prev = null;
        Node next =null;
        if(head == null){
            return ;
        }

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        while (current != null) {
            System.out.print(prev.data + "=>");
            current = current.next;
        }

    }
    public void insertLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp=temp.next;
        }
            temp.next =newnode;

    }
 }

public class LinkedList<S> {
    public static void main(String[] args) {
        LL Linked = new LL();
    Linked.insertLast(12);
        Linked.insertLast(24);
        Linked.insertLast(25);
//        Linked.ReverseLL();
        Linked.Display();


    }
}
