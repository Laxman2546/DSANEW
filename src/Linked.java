class NodeList{
   int data;
   NodeList next;
    public NodeList(int data){
        this.data = data;
        this.next = null;
    }
}
class Linked2{
    private NodeList head;
    public void inserStart(int data){
        NodeList node = new NodeList(data);
        NodeList current = head;
       if(head ==null){
           head = node;
           return;
       }
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }
        NodeList current = head;
        while (current != null){
            System.out.print(current.data + "=>");
            current = current.next;
        }
        System.out.println("null");
    }
}


public class Linked {
    public static void main(String[] args) {
        Linked2  link= new Linked2();
        link.inserStart(2);
        link.inserStart(3);
        link.inserStart(4);
        link.printList();

    }

}
