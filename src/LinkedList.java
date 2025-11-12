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


 }

public class LinkedList {
    public static void main(String[] args) {
        LL Linked = new LL();
        Linked.insertFirst(12);
        Linked.insertFirst(24);
        Linked.insertFirst(36);
        Linked.insertFirst(48);
        Linked.Display();

    }
}
