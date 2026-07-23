package LinkedList;
class ListNode{
    ListNode next;
    int data;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
class CreateLink{
    private  ListNode head;
    public void createlink(int data){
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
        }
        temp.next = node;
    }
}
public class MergeList {
    public static void main(String[] args) {
        CreateLink link = new CreateLink();
        link.createlink(1);
        link.createlink(2);
        link.createlink(4);
        CreateLink link2 = new CreateLink();
        link.createlink(1);
        link.createlink(3);
        link.createlink(5);

    }
}
