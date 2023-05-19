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
    public ListNode insertionSortList(ListNode head) {
        ListNode h2 = head.next;
        while(h2!=null){
            ListNode st = head;
            while(st!=h2){
                if(h2.val<st.val){
                    int t = h2.val;
                    h2.val = st.val;
                    st.val = t;
                }
                else{
                    st=st.next;
                }
            }
            h2=h2.next;
        }
        return head;
    }
}