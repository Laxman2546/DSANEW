/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode temp = head;
        ListNode middle = findMiddle(temp);
        ListNode nextHalf = middle.next;
        middle.next = null;
        ListNode reverseHead = reverse(nextHalf);
        mergeList(head,reverseHead);
    }
    public ListNode findMiddle(ListNode temp){
        ListNode slow = temp;
        ListNode fast = temp.next;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode reverse){
        ListNode prev = null;
        while(reverse != null){
            ListNode temp = reverse;
            reverse = reverse.next;
            temp.next = prev;
            prev = temp;
        }
        reverse = prev;
        return reverse;
    }
    public void mergeList(ListNode head,ListNode reverseHead){
        while(head != null && reverseHead != null){
            ListNode nextHead = head.next;
            ListNode revNext = reverseHead.next;
           head.next = reverseHead;
           reverseHead.next = nextHead;
             reverseHead = revNext;
           head = nextHead;
        }
    }
}