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
    public int pairSum(ListNode head) {
        int ans = 0;
        int n = 0;
        ListNode t = head;
    
        while(t != null){
            n++;
            t = t.next;
        }
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        int it = 0;
        while (it != (n/2)) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            it++;
        }

        while(prev!=null){
            ans = Math.max(ans, (current.val+prev.val));
            prev = prev.next;
            current = current.next;
        }
        
        
        return ans;
    }
}