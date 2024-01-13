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
    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseK(head, k);
    }
    static ListNode reverseK(ListNode head,int k){
        var cur = head; 
        ListNode ans = null;
        ListNode preTail=null;
        while(cur != null){
            var curTail = cur;
            int c = 1;
            var w = cur;
            while(c<k && w!=null){
                c+=1;
                w = w.next;
            }
            if(w == null){
                if(preTail!=null){
                    preTail.next = cur;
                    return ans;
                }else{
                    return head;
                }
            }
            w = w.next;
            
            ListNode pre = null;
            while(cur != w){
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            if(ans == null){
                ans = pre;
            }
            if(preTail!=null){
                preTail.next = pre;
                preTail = curTail;
            }else{
                preTail = curTail;
            }
        }
        return ans;//==null?head:ans;
    }
}