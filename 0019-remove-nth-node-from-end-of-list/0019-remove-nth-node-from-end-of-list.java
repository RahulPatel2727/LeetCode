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
        return delete(head,n);
    }
    static ListNode delete(ListNode list, int k){
        int c = 0;
        var temp = list;
        while(temp!=null){c++; temp=temp.next;};
        int itr = c - k;
        if( k>c || k<=0) return list;
        if(itr==0) return list.next;
        temp = list;
        while(itr-->1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return list;
    }
}