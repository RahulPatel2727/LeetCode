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
    public ListNode deleteDuplicates(ListNode head) {
        return remove(head);   
    }
    static ListNode remove(ListNode  head){
        if(head==null || head.next == null) return head;
        var si=head;
        var ei = head;
        while(ei!=null){
            if(si.val != ei.val){
                si.next = ei;
                si=si.next;
            }
            ei = ei.next;
        }
        if(si != ei){
            si.next = ei;
        }
        return head;
    }
}