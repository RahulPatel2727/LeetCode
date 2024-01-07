/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return intersectionPoint(headA, headB);
    }
    static ListNode intersectionPoint(ListNode a, ListNode b){
        var aa = a; var bb = b;
        while(aa.next!=null && bb.next!=null){
            aa = aa.next;
            bb = bb.next;
        }
        ListNode si=null, ei=null, low=null;
        if(aa.next==null){
            si=b; ei=bb;
            low = a;
        }else{
            si=a; ei=aa;
            low = b;
        }
        while(ei.next!=null){
            ei=ei.next;
            si=si.next;
        }
        while(si!=null && low!=null){
            if(si==low) {
                // var ans = si;
                // ans.next = null;
                return si;
            }
            si=si.next; low = low.next;
        }
        return null;
    }
}