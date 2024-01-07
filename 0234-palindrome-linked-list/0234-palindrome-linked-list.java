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
    public boolean isPalindrome(ListNode head) {
        return isPalindrome_(head);   
    }
    static boolean isPalindrome_(ListNode list) {
        ListNode slow = list, fast = list;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        var cur = slow.next;
        ListNode pre = null;
        while(cur!=null){
            var temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        ListNode f = list, s=pre;
        boolean flag = true;
        while(s!=null){
            if(f.val != s.val){
                flag = false;
                break;
            }
            f=f.next;
            s=s.next;
        }  
        cur = pre; pre = null;
        while(cur != null){
            var temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return flag;
    }
}