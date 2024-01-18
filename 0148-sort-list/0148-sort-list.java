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
        return sort(head);
    }
    static ListNode sort(ListNode head){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        var cur = head;
        while(cur!=null){
            pq.add(cur.val);
            cur = cur.next;
        }
        cur = head; 
        while(cur!=null){
            cur.val = pq.poll();
            cur = cur.next;
        }
        return head;
    }
}