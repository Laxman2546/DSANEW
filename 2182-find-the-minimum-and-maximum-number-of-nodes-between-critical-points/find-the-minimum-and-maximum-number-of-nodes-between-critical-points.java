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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[2];
        ListNode prev = head;
        ListNode curr = head.next;
        if(curr.next == null)return new int[]{-1,-1};
        List<Integer> ls = new ArrayList<>();
        int i = 2;
        while(curr.next != null){
            if(prev.val > curr.val && curr.val < curr.next.val){
                ls.add(i);
            }else if(prev.val < curr.val && curr.val > curr.next.val){
                ls.add(i);
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        if(ls.size() <= 1)return new int[]{-1,-1};
        int minDistance = Integer.MAX_VALUE;   
        for(int j=0;j<ls.size()-1;j++){
            int dist = ls.get(j+1) - ls.get(j);
            minDistance = Math.min(minDistance,dist);
        }
       int maxDistance = ls.get(ls.size()-1) - ls.get(0);
        res[0] = minDistance;
        res[1] = maxDistance;
        return res;
    }
}