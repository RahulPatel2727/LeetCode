/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head, f=head, si = head;
        boolean flag = false;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(s==f) { flag = true; break; }
        }
        if(flag){
            while(si!=null && f!=null){
                if(si==f) return si;
                si=si.next;
                f=f.next;
            }
        }
        return null;
        
    }
}