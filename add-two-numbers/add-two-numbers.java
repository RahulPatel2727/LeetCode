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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(-1);
        ListNode res = l3;

        int rem=0;
        while(l1!=null && l2!=null){
            rem+=l1.val+l2.val;
            l3.next=new ListNode(rem%10);
            l3=l3.next;
            rem = rem/10;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null){
            while(l2!=null){
                rem+=l2.val;
                l3.next=new ListNode(rem%10);
                l3=l3.next;
                rem = rem/10;
                l2=l2.next;
            }
        }
        else {
            while(l1!=null){
                rem+=l1.val;
                l3.next=new ListNode(rem%10);
                l3=l3.next;
                rem = rem/10;
                l1=l1.next;
            }
        }
        if(rem!=0){
            l3.next=new ListNode(rem%10);
            l3=l3.next;
        }
        return res.next;
    }
}




