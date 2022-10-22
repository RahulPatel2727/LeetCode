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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
                head = head.next;
        }
        if(head == null){
            return head;
        }
        ListNode temp = head;
        ListNode pre = null;
        while(temp.next != null){
            if(temp.val == val){
                pre.next = temp.next;
                temp.next = null;
                temp = pre.next;
                continue;
            }
            pre = temp;
            temp = temp.next;
        }
        if(temp.val==val){
            System.out.println(pre.val+" ");
            pre.next=null;
        }
        return head;
        // if(head == null ){
        //     return head;
        // }
        
        // ListNode prenode = null;
        // ListNode temp = head;
        // while(temp!=null || head!=null){
        //     if(head.val == val){
        //         head=head.next;
        //         temp = head;
        //     }
        //     else{
        //         if(temp.val == val){
        //             prenode.next=temp.next;
        //             temp.next=null;
        //             temp = prenode;
        //         }
        //         prenode = temp;
        //         temp=temp.next;
        //     }
        // }
        // return head;
    }
}