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
    public ListNode rotateRight(ListNode head, int k) {
        return rotateKtime(head, k);
    }
    static ListNode rotateKtime(ListNode head, int k){
        if(head==null) return null;
        int n = 0;
        var cur = head;
        ListNode tail = null;
        
        // length and tail finding
        while(cur != null) {
            n++;
            tail = cur;
            cur=cur.next;
        }
        k %= n;
        if(k==0) return head;
        n = n - k;
        cur = head;
        ListNode pre = null;
        
        // new head finding
        while(n-->0){
            pre = cur;
            cur = cur.next;
        }
        // connection changing
        pre.next = null;
        tail.next = head;
        head = cur;
        return head;
    }
}