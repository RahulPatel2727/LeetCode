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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        ListNode third = head.next.next;
        
        head = second;
        // head.next = first;
        second.next = first;
        // head.next.next=swapPairs(third);
        first.next = swapPairs(third);
        return head;
    }
}