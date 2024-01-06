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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return delete2(head,n);
    }
     static ListNode delete2(ListNode list, int k){
        if(k<=0) return list;
        ListNode slow = list, fast = list;
        for(int i=1;i<k && fast != null;i++){
            fast = fast.next;
        }

        if(fast==null) return list;// larger than list
        if(fast.next==null) return list.next; // head ko delete

        fast=fast.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;
        return list;
    }
}