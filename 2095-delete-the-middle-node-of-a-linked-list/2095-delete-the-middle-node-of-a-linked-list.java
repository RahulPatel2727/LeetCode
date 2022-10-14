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
    public ListNode deleteMiddle(ListNode head) {
         if (head.next == null)
            return null;
        ListNode c=head;
        int count=0;
        while(c!=null){
            count++;
            c=c.next;
        }
        
        ListNode temp = head;
        int middleIndex=count/2;;
        for (int i = 0; i < middleIndex - 1; ++i)
            temp = temp.next;
       temp.next=temp.next.next;
        return head;
        
    }
}