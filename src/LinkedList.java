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
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        // Create a dummy node to act as the starting point
//        ListNode dummy = new ListNode(0);
//        ListNode tail = dummy;
//
//        while (list1 != null && list2 != null) {
//            // Compare the values of the two nodes
//            if (list1.val <= list2.val) {
//                tail.next = list1;   // Connect the smaller node
//                list1 = list1.next;  // Move the pointer in list1
//            } else {
//                tail.next = list2;
//                list2 = list2.next;
//            }
//            tail = tail.next; // Move the tail of our merged list forward
//        }
//
//        // If one list is exhausted, attach the remainder of the other list
//        if (list1 != null) {
//            tail.next = list1;
//        } else {
//            tail.next = list2;
//        }
//
//        // Return the actual head (the node after our dummy)
//        return dummy.next;
//    }
//}
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
