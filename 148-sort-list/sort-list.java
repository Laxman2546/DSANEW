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
    public ListNode sortList(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            res.add(temp.val);
            temp = temp.next;
        }
        ListNode newHead = new ListNode(0);
        ListNode dummy = newHead;
        res.sort(null);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
            dummy.next = new ListNode(res.get(i));
            dummy = dummy.next; 
        }
        return newHead.next;
    }
}